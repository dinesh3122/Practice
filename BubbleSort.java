package com.dinesh.practice.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = {5, 6, 3, 2, 1};
		
		int numbersLength = numbers.length;
		for(int i=numbersLength-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		for(int count=0; count<numbersLength; count++) {
			System.out.print(numbers[count]);
		}
	}
}
