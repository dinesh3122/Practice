package com.dinesh.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> list = new Vector<Integer>();
		list.add(1);
		list.add(5);
		list.add(20);
		list.add(2);
		list.add(200);
//		list.add("Dinesh");
		Collections.sort(list);
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
