package com.sampath.banking;

import java.util.List;
import java.util.LinkedList;

public class TransactionDetails {
	public static List<Transaction> transList= new LinkedList<>();
	
	public static void addTransaction(Transaction t){
		transList.add(t);
	}
	public static void showMiniStatement(int accNumber){
		System.out.println("The Statement for the Account number : " + accNumber);
		System.out.println();
		for(Transaction t : transList){
			if(t.getAccNumber()==accNumber){
				System.out.println(t.getTransactionNumber()+"--" + t.getTransactionBalance()+"--"
						+t.getTransactionType()+"--"+t.getAccountBalanceAfterTransaction());
			}
		}
	}
}
