package com.dinesh.practice.methods;


public class MultipleStaticMethods {
	
	static {
//		System.out.println("Hello");
		System.out.println("Hello Static");
//		System.out.println(addition());
		
	}
	
	static int abc = 100;
	
	public static void main(String[] args) {
		addition();
//		System.out.println(addResult);
		System.out.println(abc);
	}
	
	static void addition() {
		int a = getAValue();
		int b = getBvalue();
		System.out.println(a+b);
	}
	
	private static int getBvalue() {
		int b=10;
		return b;
	}

	private static int getAValue() {
		return 20;
	}

	static int subtraction(int a, int b) {
		return a-b;
	}

}
