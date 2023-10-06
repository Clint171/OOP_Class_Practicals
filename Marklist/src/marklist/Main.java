package marklist;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[4];
		System.out.println("Input Format:\n[ROLL] [NAME] [MARK1] [MARK2] [MARK3]");
		for(int i = 0 ; i < students.length ; i++){
			System.out.println("Input student "+ (i+1) + " details:");	
			Integer roll = new Integer(scanner.next());
			String name = scanner.next();
			Integer mark1 = new Integer(scanner.next());
			Integer mark2 = new Integer(scanner.next());
			Integer mark3 = new Integer(scanner.next());
			students[i] = new Student(roll , name , mark1 , mark2 , mark3);
			
		}
		scanner.close();
		printHeader();
		printTable(students);
	}
	static void printHeader(){
		String line = new String(new char[65]).replace("\0","*");
		System.out.println(line);
		System.out.println("\t\t\tSTUDENT MARKLIST");
		System.out.println(line);
	}
	static void printTable(Student[] students){
		System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
		for(int i = 0 ; i < students.length ; i++){
			System.out.println(students[i].roll+"\t"+students[i].name+"\t  "+students[i].mark1+"\t  "+students[i].mark2+"\t  "+students[i].mark3+"\t  "+students[i].total+"\t   "+students[i].result+"\t "+(double)students[i].average+"\t  "+students[i].grade);
		}
	}
}
