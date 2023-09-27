package transcript;
import java.util.Scanner;

public class Main {
	static String line = new String(new char[78]).replace("\0" , "_");
	static String dottedLine = new String(new char[78]).replace("\0" , "-");

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Unit[] units = new Unit[4];
		for(int i = 0 ; i < units.length ; i++){
			System.out.println("Please input Unit Code, Unit name, and Unit score for Unit "+ (i+1)+"\nSeparate them with a space:");
			String code = scanner.next();
			String name = scanner.next();
			Integer score = new Integer(scanner.next());
			
			units[i] = new Unit(code ,name, score);
		}
		scanner.close();
		Transcript transcript = new Transcript("Clint Simiyu", "C026-01-0972/2022", 2.2, units);
		printHeader();
		printDetails(transcript);
		printUnits(units);
		printTotals(transcript);
		printGrades(transcript);
		
	}
	static void printHeader(){
		System.out.println("\t\t\tDepartment of Computer Science");
		System.out.println("\t\t\t     End of Semester Results");
		System.out.println(dottedLine);
	}
	static void printDetails(Transcript transcript){
		System.out.println("|Name:- "+transcript.name+"\t|Roll_No: "+ transcript.rollNo+"\tSemester: "+transcript.semester);
		System.out.println(line);
	}
	static void printUnits(Unit[] units){
		System.out.println("|Unit Code\t\t|Unit Name:\t\t\tScore");
		System.out.println(dottedLine);
		for(int i = 0 ; i < units.length ; i++){
			System.out.println("|"+units[i].unitCode+"\t\t|"+units[i].unitName+"\t\t\t|"+units[i].score);
			if(i !=units.length-1){
				System.out.println();
			}
		}
		System.out.println(dottedLine);
	}
	static void printTotals(Transcript transcript){
		System.out.println("|Total\t\t\t\t\t\t\t|"+transcript.totals);
		System.out.println(dottedLine);
		System.out.println("|Average\t\t\t\t\t\t|"+transcript.average);
		System.out.println(dottedLine);
		System.out.println("|Grade\t\t\t\t\t\t\t|"+transcript.grade);
		System.out.println(dottedLine);
		System.out.println("\t\t\t\t\t  Recommendation|");
		System.out.println(dottedLine);
		
	}
	static void printGrades(Transcript transcript){
		System.out.println("Grading criteria\t\tOverall Grade(A-D)\t\tRecommend Pass");
		System.out.println("70-100\t\tA");
		System.out.println("60-70\t\tB");
		System.out.println("50-60\t\tC");
		System.out.println("40-50\t\tD");
		System.out.println("Below 40\tF");
		System.out.println(dottedLine);
	}

}