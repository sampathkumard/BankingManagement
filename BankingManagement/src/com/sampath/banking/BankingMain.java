package com.sampath.banking;

public class BankingMain {

	public static void main(String[] args) {
		BankAccount b1= new BankAccount(111, "Sam", 10000);
		BankAccount b2= new BankAccount(222, "Danny", 20000);
		b1.deposit(200);
		b1.deposit(500);
		b1.deposit(9000);
		b1.withdraw(2000);
		b1.withdraw(400);
		System.out.println("------------");
		TransactionDetails.showMiniStatement(111);
		b2.deposit(200);
		b2.deposit(500);
		b2.deposit(9000);
		b2.withdraw(2000);
		b2.withdraw(40000);
		System.out.println("------------");
		TransactionDetails.showMiniStatement(222);
		
		
	}

}
