package dev.clint;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int totals[] = new int[4];
		String results[] = new String[4];
		double averages[] = new double[4];
		String grades[] = new String[4];
		int rollNumber[] = new int[4];
		String names[] = new String[4];
		int marks[][] = new int[4][3];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0 ; i < rollNumber.length ; i++){
			System.out.print("Enter the Student Roll Number: ");
			int roll = new Integer(scanner.nextLine());
			rollNumber[i] = roll;
			System.out.print("Enter the Student Name :");
			String name = scanner.nextLine();
			names[i] = name;
			System.out.println();
			System.out.println("Enter the three marks  : ");
			int total = 0;
			for(int j = 0 ; j < 3 ; j++){
				System.out.print("Mark"+(j+1)+" :");
				int mark = new Integer(scanner.nextLine());
				marks[i][j] = mark;
				total += mark;
			}
			System.out.println("The total is  : "+ total);
			totals[i] = total;
			averages[i] = total/3;
			if(averages[i] > 50){
				results[i] = "P";
			}
			else{
				results[i] = "F";
			}
			if(averages[i] >= 70 && averages[i] <=100){
				grades[i] = "A";
			}
			else if(averages[i] >= 50){
				grades[i] = "B";
			}
			else{
				grades[i] = "C";
			}
		}
		String line = new String(new char[66]).replace("\0", "*");
		System.out.println(line);
		System.out.println("\t\t\tSTUDENT MARKLIST");
		System.out.println(line);
		System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
		for(int k = 0 ; k < 4 ; k++){
			System.out.print(rollNumber[k]+"\t"+names[k]+"\t");
			for(int l = 0 ; l < 3 ; l++){
				System.out.print(marks[k][l]+"\t");
			}
			System.out.print(totals[k]+"\t");
			System.out.print(results[k]+"\t");
			System.out.print(averages[k]+"\t");
			System.out.print(grades[k]+"\t");
			System.out.println();
		}

	}

}
