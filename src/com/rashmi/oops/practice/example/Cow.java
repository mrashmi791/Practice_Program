package com.rashmi.oops.practice.example;

public class Cow extends Animal {

	public Cow(String name) {
		super(name);
		System.out.println("Name is "+name);
	}
	

	@Override
	void sound() {
		System.out.println("Sound is like vow ");
		
	}
	

}
