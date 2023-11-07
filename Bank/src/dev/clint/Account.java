package dev.clint;

public class Account {

	public static void main(String[] args) {
		System.out.println("SAVINGS ACCOUNT DETAILS");
		SavingsAccount sac = new SavingsAccount(1001,"Ann Kamau", "07200000","test@gmail.com",1000);
		sac.accountholder();
		sac.deposit(500);
		sac.displayBalance();
		
		System.out.println("");
		System.out.println("");
		System.out.println("CURRENT ACCOUNT DETAILS");
		CurrentAccount current = new CurrentAccount(1001,"Peter Smith", "08100000","admin@gmail.com",0.0);
		current.accountholder();
		current.deposit(500);
		current.displayBalance();
	}

}