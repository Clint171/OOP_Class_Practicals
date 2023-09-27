package transcript;

public class Transcript{
	String name;
	String rollNo;
	Double semester;
	Unit[] units;
	Integer totals;
	Double average;
	String grade;
	public Transcript(String name,String rollNo,Double semester,Unit[] units){
		this.name = name;
		this.rollNo = rollNo;
		this.semester = semester;
		this.units = units;
		this.totals = getTotals(units);
		this.average = getAverage(totals , units);
		this.grade = getGrade(average);
		
	}
	Integer getTotals(Unit[] units){
		Integer totals = 0;
		for(int i = 0 ; i < units.length ; i++){
			totals += units[i].score;
		}
		return totals;
	}
	Double getAverage(Integer totals , Unit[] units){
		Double average = (double)totals/(double)units.length;
		return average;
	}
	String getGrade(Double average){
		if((average >= 70)&&(average <= 100)){
			return "A";
		}
		else if(average >= 60){
			return "B";
		}
		else if(average >= 50){
			return "C";
		}
		else if(average >= 40){
			return "D";
		}
		else {
			return "F";
		}
	}
	
}
