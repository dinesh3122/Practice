package com.dinesh.practice.bank;

public class CheckinAccount extends BaseBankOperations {

	public static void main(String[] args) {
		int balance = 100;
		System.out.println("Balnce:" + balance);
		
		balance = deposit(balance, 50);
		System.out.println("Balnce:" + balance);
	}
}
