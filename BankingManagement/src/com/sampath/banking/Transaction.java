package com.sampath.banking;

public class Transaction {
	private int transactionNumber; //we need random number
	private int accNumber;
	private int transactionBalance;
	private String transactionType;
	private int accountBalanceAfterTransaction;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Transaction(int transactionNumber, int accNumber, int transactionBalance, String transactionType,
			int accountBalanceAfterTransaction) {
		super();
		this.transactionNumber = transactionNumber;
		this.accNumber = accNumber;
		this.transactionBalance = transactionBalance;
		this.transactionType = transactionType;
		this.accountBalanceAfterTransaction = accountBalanceAfterTransaction;
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getTransactionBalance() {
		return transactionBalance;
	}
	public void setTransactionBalance(int transactionBalance) {
		this.transactionBalance = transactionBalance;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getAccountBalanceAfterTransaction() {
		return accountBalanceAfterTransaction;
	}
	public void setAccountBalanceAfterTransaction(int accountBalanceAfterTransaction) {
		this.accountBalanceAfterTransaction = accountBalanceAfterTransaction;
	}
	

}
