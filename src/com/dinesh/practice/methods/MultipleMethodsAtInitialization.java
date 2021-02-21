package com.dinesh.practice.methods;

class NonStaticMethods {
	int a;
	int b;
	
	void addition() {
		System.out.println(a+b);
//		int a = getAValue();
//		int b = getBValue();
//		int c = a+b;
	}
	
	private int getAValue() {
		return 230;
	}

	private int getBValue() {
		return 250;
	}

	void subtraction() {
		System.out.println(a-b);
		
	}
}

public class MultipleMethodsAtInitialization {
	public static void main(String[] args) {
		NonStaticMethods nonStaticMethods = new NonStaticMethods();
		nonStaticMethods.a= 100;
		nonStaticMethods.b= 200;
		nonStaticMethods.addition();
		nonStaticMethods.subtraction();
		
		NonStaticMethods a1 = new NonStaticMethods();
		a1.a= 1000;
		a1.b= 2000;
		a1.addition();
		a1.subtraction();
		
		
		NonStaticMethods a2 = new NonStaticMethods();
		a2.a= 10000;
		a2.b= 20000;
		a2.addition();
		a2.subtraction();
	}

}
