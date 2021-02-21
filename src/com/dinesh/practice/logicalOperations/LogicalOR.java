package com.dinesh.practice.logicalOperations;

public class LogicalOR {
	public static void main(String[] args) {
		int i =10;
		int j=20;
		
//		boolean iCheck = ;
//		boolean jCheck = checkJvalue(20);
		if(checkIvalue(10) || checkJvalue(20)) {
			System.out.println("I am good");
		}
	}
	
	static boolean checkIvalue(int i) {
		if (i == 100) {
			return true;
		}
		return false;
	}

	static boolean checkJvalue(int j) {
		if (j == 20) {
			return true;
		}
		return false;
	}

}
