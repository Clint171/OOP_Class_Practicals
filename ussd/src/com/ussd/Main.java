package com.ussd;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		Menu menu0 = new Menu();
		menu0.id = 0;
		menu0.childMenu = 1;
		menu0.offers = new OkoaOffer[8];
		
		menu0.offers[0] = new OkoaOffer(0,"SPECIAL","MINUTES",30,3.0,20);
		menu0.offers[0] = new OkoaOffer(1,"SPECIAL","MINUTES",15,1.0,10);
		menu0.offers[0] = new OkoaOffer(2,"SPECIAL","MINUTES",15,12.0,20);
		menu0.offers[0] = new OkoaOffer(3,"NORMAL","AIRTIME",50,72.0,50);
		menu0.offers[0] = new OkoaOffer(3,"NORMAL","AIRTIME",20,72.0,20);
		menu0.offers[0] = new OkoaOffer(3,"NORMAL","AIRTIME",10,72.0,10);
		menu0.offers[0] = new OkoaOffer(3,"NORMAL","AIRTIME",5,3.0,5);
		menu0.offers[0] = new OkoaOffer(3,"NORMAL","DATA",900,1.0,20);
		
		printMenuOffers(menu0);
	
	}
	
	
	static void printMenuOffers(Menu menu){
		for(int i = 0 ; i< menu.offers.length ; i++){
			
			if(menu.offers[i].type.equals("SPECIAL")){
				
				if(menu.offers[i].commodity.equals("MINUTES")){
					System.out.printf("%d:Sh%d (%dmins, %.0fhrs)",menu.offers[i].id,menu.offers[i].cost,menu.offers[i].value,menu.offers[i].duration);
				}			
			}
			
			else{
				if(menu.offers[i].commodity.equals("MINUTES")){
					System.out.printf("%d:Sh%d (%dmins, %dhrs)",menu.offers[i].id,menu.offers[i].cost,menu.offers[i].value,menu.offers[i].duration);
				}
				
				else if(menu.offers[i].commodity.equals("AIRTIME")){
					System.out.printf("%d:Okoa %d",menu.offers[i].id,menu.offers[i].value);
				}
				else if(menu.offers[i].commodity.equals("DATA")){
					System.out.printf("%d:Okoa %d (%dMB, %.0fhr)",menu.offers[i].id,menu.offers[i].cost,menu.offers[i].value,menu.offers[i].duration);
				}
				
			}
			
		}
	}
	
	
	static void printConfirmation(OkoaOffer offer){
		System.out.println("Existing Unpaid Okoa: 0");
		System.out.println("New Okoa request: "+ offer.cost);
		System.out.println("TOTAL DEBT will be: "+ offer.cost);
		System.out.println("1:Accept");
		System.out.println("2:Decline");
		System.out.println("0:BACK 00:HOME");
	}

}
