package com.main;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Invoice {

	public static void main(String[] args) {
		//Variable declaration (and initialization if necessary)
		String names = "C026-01-0972/2022";
		String address = "Clint Gretty Lionel Simiyu";
		String contact = "0100100100";
		Double subtotal = 0.00;
		Double VAT;
		Double total;
		
		//Get current date in required format
		LocalDate date = LocalDate.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = date.format(myFormatObj);
		
		//Array of records to be put on the invoice
		Record[] records = new Record[4];
		records[0] = new Record(4,"Pencil",20);
		records[1] = new Record(10,"Duster",50);
		records[2] = new Record(9,"Pens",30);
		records[3] = new Record(10,"crayon",80);
		
		//Calculating subtotal, VAT and total
		for(int j = 0 ; j< records.length ; j++){
			subtotal += records[j].getAmount();
		}
		VAT = subtotal * 16/100;
		total = subtotal + VAT;
		//Methods to build the invoice
		printHeader();
		
		printCustomerDetails(names , address , contact , formattedDate);
		 
		printTable(records);
		
		printTotals(subtotal , VAT , total);
		
	}
	static void printHeader(){
		System.out.println("**************************Adamson Computers Ltd***************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla... Quezon City * Tel. No:123-4567   ");
		System.out.println("                 VAT REG. TIN 098-765-4321-0000                           ");
		System.out.println("                         SALES INVOICE                                    ");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	static void printCustomerDetails(String names , String address , String contact , String date){
		System.out.printf("Sold to:%s\t\t\t\tDate:%s\n" , names , date);
		System.out.printf("Address:%s\t\t\tContact Number:%s\n", address , contact);
		System.out.println();
		System.out.println();
	}
	static void printTable(Record[] records){
		String dottedLine = new String(new char[78]).replace("\0" , "-");
		String doubleDottedLine = new String(new char[78]).replace("\0" , "=");
		System.out.println(doubleDottedLine);
		System.out.println("Qty\t|\tItem Description\t|\tUnit Price\t|Amount");
		System.out.println(doubleDottedLine);
		//Inserting the records into the table using the array of records
		for(int i = 0; i< records.length ; i++){
			System.out.printf("%d\t|\t%s\t\t\t|\t%d\t\t|%.2f\n",records[i].getQty(),records[i].getItemDescription(),records[i].getUnitPrice(),records[i].getAmount());
			if(i != records.length - 1){
				System.out.println(dottedLine);
			}
		}
		//End of records
		System.out.println(doubleDottedLine);
	}
	static void printTotals(Double subtotal,Double VAT,Double total){
		System.out.println("\t\t\t\t\t\t|Sub Total      |"+subtotal);
		System.out.println("\t\t\t\t\t\t==============================");
		System.out.println("\t\t\t\t\t\t|VAT(16%)       |"+VAT);
		System.out.println("\t\t\t\t\t\t==============================");
		System.out.println("\t\t\t\t\t\t|Total Amount   |"+total);
		System.out.println("\t\t\t\t\t\t==============================");
	}
}
