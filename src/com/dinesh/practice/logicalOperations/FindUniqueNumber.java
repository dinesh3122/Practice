package com.dinesh.practice.logicalOperations;

public class FindUniqueNumber {
	public static void main(String[] args) {
		int[] nums = {5, 2, 5, 6, 2, 6, 7, 3, 7};
		int result = 0;
		for(int i=0; i<nums.length; i++) {
			result = result ^nums[i];
		}
		System.out.println(result);  
	}

}
