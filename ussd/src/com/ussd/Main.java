package com.ussd;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer option;
		while(true){
		
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("0:Sh20 (30mins, 3hrs)");
			System.out.println("1:Sh10 (15Mins, 1hr)");
			System.out.println("2:Sh20 (15Mins, midnight)");
			System.out.println("3:Okoa 50");
			System.out.println("4:Okoa 20");
			System.out.println("5:Okoa 10");
			System.out.println("6:Okoa 5");
			System.out.println("7:Okoa 20");
			System.out.println("8:Okoa Internet");
			System.out.println("98:More");
			
			option = new Integer(scanner.nextLine());
			
			switch(option){
			
			case 0:
				
				System.out.print("\033[H\033[2J");
				System.out.flush();
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 20");
				System.out.println("TOTAL DEBT will be: 20");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
				option = new Integer(scanner.nextLine());
				switch (option){
				case 0:
					break;
				
				default :
					System.out.println();
					
					
				}
				break;
			
			case 1:
				
				System.out.print("\033[H\033[2J");
				System.out.flush();
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 10");
				System.out.println("TOTAL DEBT will be: 10");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
				option = new Integer(scanner.nextLine());
				break;
				
			case 2:
				
				System.out.print("\033[H\033[2J");
				System.out.flush();
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 20");
				System.out.println("TOTAL DEBT will be: 20");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
				option = new Integer(scanner.nextLine());
				
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 98:
				
				
			}
		
		}
	}

}
