package com.dinesh.practice.inheretence2;

public class TaxandDiscountBase {
	
	public static double tax (double subtotal, double taxpct) {
		return subtotal + (taxpct * subtotal);
		
	}	
	
	public static double employeediscount (double discount, double subtotal, double taxpct) {
		return discount * (subtotal+(taxpct * subtotal));
		
	}
}
