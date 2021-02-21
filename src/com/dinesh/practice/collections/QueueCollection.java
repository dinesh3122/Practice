package com.dinesh.practice.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
	public static void main(String[] args) {
		Queue que = new LinkedList<Integer>();
		que.add(34);
		que.add(3456);
		que.add(5676);
		que.add(56763);
		
		System.out.println("Que size:" + que.size());
		
		while(!que.isEmpty()) {
			System.out.println(que.peek());
			que.remove();
		}
		
		que.poll();
		System.out.println("Que size:" + que.size());
	}

}
