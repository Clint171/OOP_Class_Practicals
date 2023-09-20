package marksheet;

public class Marksheet {
	static String line = new String(new char[80]).replace('\0', '_');

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(1,"Kathir",10,20,30,40,50);
		students[1] = new Student(2,"Lakshmi",90,80,70,80,100);
		students[2] = new Student(3,"Aishwarya",90,85,75,65,95);
		System.out.println("Welcome to Student Mark List Application");
		System.out.println(line);
		printTable(students);
		
	}
	static void printTable(Student[] students){
		System.out.println("Sno Student Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal");
		System.out.println(line);
		for(int i = 0 ; i<students.length ; i++){
			System.out.println(students[i].sNo+"   "+students[i].name+"\t\t"+students[i].sub1+"\t"+students[i].sub2+"\t"+students[i].sub3+"\t"+students[i].sub4+"\t"+students[i].sub5+"\t"+students[i].total);
		}
		System.out.println(line);
	}

}
