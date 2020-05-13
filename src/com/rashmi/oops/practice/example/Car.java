package com.rashmi.oops.practice.example;

public class Car implements Vehicle {

	private final String brand;
	
	public Car(String brand) {
		this.brand = brand;
		
	}
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "The car is speeding up";
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 235000;
	}

}
