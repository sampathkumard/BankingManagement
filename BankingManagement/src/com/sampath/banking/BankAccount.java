package com.sampath.banking;

import java.util.Random;

public class BankAccount {
	private int accNumber;
	private String accName;
	private int accBalance;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	public BankAccount(int accNumber, String accName, int accBalance) {
		super();
		this.accNumber = accNumber;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankAccount [accNumber=" + accNumber + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	
	public void deposit(int depositAmmount ){
		accBalance+=depositAmmount;
		Random r= new Random();
		/*After performing the deposit, we need to store the transaction details in an object of a 
		 * Transaction class and then store that object in an collection for future reference
		 */
		Transaction t = new Transaction(r.nextInt(), accNumber, depositAmmount, "deposit", accBalance);
		TransactionDetails.addTransaction(t);//static method, we can call directly
		System.out.println("Deposit Successful and Transaction is Stored");
	}
	public void withdraw(int withdrawAmmount){
		Random r = new Random();
		if(withdrawAmmount>accBalance){
			try {
				throw new InSufficientBalanceException();
			} catch (InSufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		accBalance-=withdrawAmmount;
		/*After performing the withdraw, we need to store the transaction details in an object of a 
		 * Transaction class and then store that object in an collection for future reference
		 */
		Transaction t = new Transaction(r.nextInt(), accNumber, withdrawAmmount, "withdraw", accBalance);
		TransactionDetails.addTransaction(t);//static method, we can call directly
		System.out.println("Withdraw Successful and Transaction is Stored");
	}
}
