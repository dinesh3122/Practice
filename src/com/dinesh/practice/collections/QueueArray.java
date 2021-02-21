package com.dinesh.practice.collections;

public class QueueArray {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 567;
		arr[1] = 5677;
		arr[2] = 53467;
		arr[3] = 4556;
		arr[4] = 3455;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		System.out.println("\n");
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.println(arr[i]);
		}
	}

}
