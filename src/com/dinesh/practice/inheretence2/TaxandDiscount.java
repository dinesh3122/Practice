package com.dinesh.practice.inheretence2;

import com.dinesh.practice.math.operations.MathOperations;

public class TaxandDiscount {
	
	public static void main(String[] args) {
		
		MathOperations mathop = new MathOperations ();
		
		double subtotal = 2000;
		double taxpct = .0875;
		double discount = .75;
		
		double taxamt = mathop.multiplication(subtotal, taxpct);
		System.out.println("tax amount: " + taxamt);
		
		double total = mathop.addition(subtotal, taxamt);
		System.out.println("total: " + total);
		
		double totalwithdiscount = mathop.multiplication (total, discount);
		System.out.println("total with discount: " + totalwithdiscount);
	}

}
