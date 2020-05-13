package com.rashmi.oops.practice.example;

public class TestInterface {

	public static void main(String[] args) {
		Car car = new Car("BMW");
		System.out.println(car.speedUp());
		System.out.println(car.getBrand());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		 System.out.println(Vehicle.getHorsePower(2500, 480));

	}

}
