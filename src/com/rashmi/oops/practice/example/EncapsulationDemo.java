package com.rashmi.oops.practice.example;


class Person {
	
	private double id;
	private String name;
	public Person() {
		id = Math.random();
		message();
	}
	private void message() {
		System.out.println("hii "+getId());
	}
	public double getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Rashmi");
		
		System.out.println(p1.getId() + " "+p1.getName());

	}

}
