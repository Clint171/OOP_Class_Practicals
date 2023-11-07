package dev.clint;

public class BankAccount {
		int acNo;
		String acName,acPhone,acEmail;
		double AcBal;
		public BankAccount(int acNo, String acName, String acPhone, String acEmail, double AcBal) {
			this.acNo =acNo;
			this.acName =acName;
			this.acPhone =acPhone;
			this.acEmail = acEmail;
			this.AcBal =AcBal;
		}
		public void accountholder() {
			System.out.println("Account Number: "+acNo);
			System.out.println("Account Holder Name: "+acName);
			System.out.println("Account Holder Address: "+acEmail);
			System.out.println("Account Holder Phone: "+acPhone);
			System.out.println("Account Holder Balance: "+AcBal);
		}
		
		public void deposit(double amount) {
			AcBal += amount;
			System.out.println("Deposited: $" + amount);
		}
		public void displayBalance() {
			System.out.println("Account Number: " + acNo+"\tBalance: $" + AcBal);
		}
}
