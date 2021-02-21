package com.dinesh.practice.collections;

import java.util.Stack;

public class StackCollection {
	public static void main(String[] args) {
		Stack sta = new Stack();
		sta.add(34);
		sta.add(3456);
		sta.add(5676);
		sta.add(56763);
		
		System.out.println("Stack size:" + sta.size());
		while(!sta.isEmpty()) {
			System.out.println(sta.peek());
			sta.pop();
		}
		
		System.out.println("Stack size:" + sta.size());
	}

}
