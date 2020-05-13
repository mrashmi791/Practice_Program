package com.practice.mindfire;

import java.util.Scanner;

public class CheckGreaterSmallWithoutConditionalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = num1 - num2;
		res = res >> 31;
		if(res == 0) {
			System.out.println("Number 1 is greater");
		} else {
			System.out.println("Number 2 is small");
		}
		
		
		

	}

}
