package com.dinesh.practice.inheretence;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("number?");
		int i = scanner.nextInt();
		int count = i/2;
		int j = i - (count * 2);
		//System.out.println(j);
		if (j == 1) {
			System.out.println("prime");
		}
		if (j == 0) {
			System.out.println("not prime");
		}

	}
}
