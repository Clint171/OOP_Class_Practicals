package classwork;
import java.util.Scanner;
import java.time.*;

public class Classwork{
	static String line = new String(new char[70]).replace("\0", "_");
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Integer employeeNumber,
		daysWorked,
		payRate;
		String employeeName,
		designation;
		String date = "15/9/2013";
		
		System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP : ");
		employeeNumber = new Integer(scanner.nextLine());
		//Get input, initialize variables
		System.out.print("Employee name: ");
		employeeName = scanner.nextLine();
		System.out.print("Employee designation: ");
		designation = scanner.nextLine();
		System.out.print("Days worked: ");
		daysWorked = new Integer(scanner.nextLine());
		System.out.print("Pay rate : ");
		payRate = new Integer(scanner.nextLine());
		System.out.println();
		printHeader();
		printDetails(employeeNumber,employeeName,designation,daysWorked,payRate,date);
		//Calculated
		
		Integer basicPay = daysWorked*payRate;
		Integer PF = basicPay/10;
		final Integer PROFTAX = basicPay*2/100;
		Integer gross = basicPay;
		Integer totalDeduct = PF+PROFTAX; 
		Integer netPay = gross-totalDeduct;
		
		printTable(basicPay,PF,PROFTAX);
		printTotals(gross,totalDeduct,netPay);
	}
	static void printHeader(){
		System.out.println("\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST");
		System.out.println("\t\t\t\tSALARY MONTH 9 2013");
		System.out.println();
		System.out.println();
	}
	static void printDetails(Integer empNo , String empName , String empDesignation , Integer daysWorked , Integer payRate , String genDate){
		System.out.println("\tEMP.NO.: "+empNo+"\t\tEMP.NAME: "+empName+"\tDESIGNATION: "+empDesignation);
		System.out.println();
		System.out.println("\tDAYS WORKED: "+daysWorked+"\t\tPAY RATE: "+payRate+"\t\tGEN.DATE:"+ genDate);
		System.out.println("\t"+line);
	}
	static void printTable(Integer basicPay , Integer PF , Integer proftax){
		System.out.println();
		System.out.println("\tEARNINGS\tAMOUNT(RS.)\t\tDEDUCTIONS\tAMOUNT(RS.)");
		System.out.println("\t"+line);
		System.out.println();
		System.out.println("\tBASIC PAY\t"+basicPay+"\t\t\tP.F.\t\t"+PF);
		System.out.println();
		System.out.println("\t\t\t\t\t\tPROF.TAX\t"+proftax);
		System.out.println("\t"+line);
	}
	static void printTotals(Integer gross , Integer totalDeduct , Integer netPay){
		System.out.println();
		System.out.println("\tGROSS EARN.\t"+gross+"\t\t\tTOTAL DEDUCT.\t"+totalDeduct);
		System.out.println("\t\t\t\t\t\tNET PAY\t\t"+netPay);
		System.out.println("\t"+line);
	}
	
	

}
