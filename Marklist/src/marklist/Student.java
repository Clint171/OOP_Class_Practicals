package marklist;

public class Student {
	Integer roll;
	String name;
	Integer mark1;
	Integer mark2;
	Integer mark3;
	//Calculated
	Integer total;
	String result;
	Integer average;
	String grade;
	
	public Student(Integer roll,String name,Integer mark1,Integer mark2,Integer mark3){
		this.roll = roll;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.total = mark1 + mark2 + mark3;
		this.average = total/3;
		this.result = setResult(average);
		this.grade = setGrade(average);
		
	}
	String setResult(Integer average){
		if(average >= 40){
			return "P";
		}
		else{
			return "F";
		}
	}
	String setGrade(Integer average){
		String grade;
		if(average >= 80 && average <= 100){
			grade = "A";
		}
		else if(average >= 75){
			grade = "B+";
		}
		else if(average >= 65){
			grade = "B";
		}
		else if(average >= 55){
			grade = "C+";
		}
		else if(average >= 50){
			grade = "C";
		}
		else if(average >= 40){
			grade = "D";
		}
		else{
			grade = "F";
		}
		return grade;
	}
}
