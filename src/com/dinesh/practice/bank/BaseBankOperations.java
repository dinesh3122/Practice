package com.dinesh.practice.bank;

public class BaseBankOperations {
	
	public static int deposit(int balance, int amount) {
		return balance + amount;
	}
	
	public int withdrawal(int balance, int amount) {
		return balance - amount;
	}
}
