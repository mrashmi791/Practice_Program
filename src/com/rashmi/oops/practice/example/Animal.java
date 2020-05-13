package com.rashmi.oops.practice.example;

abstract class Animal {
	private String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	public void eat() {
		System.out.println("eating......");
	}
	abstract void sound();
}
