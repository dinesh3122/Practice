package com.dinesh.practice.polymorphism;

public class HouseMain {
	
	public static void main(String[] args) {
		RubisHouse house = new DineshHouse();
		house.bedRoom();
		
		house = new MahendraHouse();
		house.bedRoom();
	}

}
