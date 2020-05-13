package com.rashmi.oops.practice.example;

 abstract class Employee {
	 private String name;
	 private int perHour;
	 
	 public Employee(String name, int hour) {
		super();
		this.name = name;
		this.perHour = hour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getPerHour() {
		return perHour;
	}

	public void setPerHour(int perHour) {
		this.perHour = perHour;
	}

	public abstract int calculateSalary();
	
}

 class Contractor extends Employee {
	 private int workingHour;
	
	public Contractor(String name, int hour, int workingHour) {
		super(name, hour);
		this.workingHour = workingHour;
	}

	@Override
	public int calculateSalary() {
		
		return getPerHour()*workingHour;
	}

	 
 }
 
 class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name, int hour) {
		super(name, hour);
		
	}
	@Override
	public int calculateSalary() {
		
		return getPerHour()*8;
	}
 }

public class AbstractClassExample {
	public static void main(String[] args) {
		

        Employee contractor = new Contractor("contractor", 10, 10);
        Employee fullTimeEmployee = new FullTimeEmployee("full time employee", 8);
        System.out.println(contractor.calculateSalary());
        System.out.println(fullTimeEmployee.calculateSalary());
		

	}

}
