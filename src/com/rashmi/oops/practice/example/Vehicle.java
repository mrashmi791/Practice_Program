package com.rashmi.oops.practice.example;

public interface Vehicle {
	
	String getBrand();
	String speedUp();
	int price();
	
	default String turnAlarmOn() {
		return "turning alarm on";
		
	}
	default String turnAlarmOff() {
		return "turning alarm off";
		
	}
	static int getHorsePower(int rpm,int torque) {
		return (rpm*torque)/5252;
		
		
	}

}
