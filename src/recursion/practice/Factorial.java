package recursion.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println(result);
		sc.close();
		
	}

	public static int factorial(int num) {
		if(num == 1) {
			return num;
		} return num*factorial(num-1);
	}
}
