package com.practice.mindfire;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		int res = num1 >> 31;
		if(res == 0) {
			System.out.println("Number  is positive");
		} else {
			System.out.println("Number  is negative");
		}

	}

}
