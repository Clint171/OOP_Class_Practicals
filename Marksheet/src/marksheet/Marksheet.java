package marksheet;

public class Marksheet {

	public static void main(String[] args) {
		int databaseScore = 70;
		int systemsScore = 68;
		int algorithmScore = 74;
		int statisticsScore = 65;
		int total = 277;
		double average = (double)total/4;
		char grade = 'A';
		String recommendation = "";
		
		String line = new String(new char[80]).replace('\0', '_');
		String dottedLine = new String(new char[80]).replace('\0', '-');
		String dottedLine2 = "----------------------------------------------------------------------------";
		System.out.println("                    Department of Computer Science                   ");
		System.out.println("                        End of Semester Results                      ");
		System.out.println(dottedLine);
		System.out.println("|Name:-                  |Roll_No:                     |Semester:");
		System.out.println(line);
		System.out.println("|Unit Code               |Unit Name:                    Score");
		System.out.println(dottedLine);
		System.out.println("|CCS2101                 |Database                     |"+ databaseScore);
		System.out.println();
		System.out.println("|CCS2102                 |Systems                      |"+ systemsScore);
		System.out.println();
		System.out.println("|CCS2103                 |Algorithm                    |"+ algorithmScore);
		System.out.println();
		System.out.println("|CCS2104                 |Statistics                   |"+statisticsScore);
		System.out.println(dottedLine);
		System.out.println("|Total                                                 |"+ total);
		System.out.println(dottedLine);
		System.out.println("|Average                                               |"+ average);
		System.out.println(dottedLine);
		System.out.println("|Grade                                                 |"+ grade);
		System.out.println(dottedLine);
		System.out.println("                                         Recommendation|"+ recommendation);
		System.out.println(dottedLine);
		System.out.println("Grading Criteria           Overall Grade(A-D)           Recommend Pass" );
		System.out.println("70-100        A                                                        ");
		System.out.println("60-69         B                                                        ");
		System.out.println("50-59         C                                                        ");
		System.out.println("40-49         D                                                        ");
		System.out.println("Below 40      F                                                        ");
		System.out.println(dottedLine);
		System.out.println(dottedLine2);
	}

}
