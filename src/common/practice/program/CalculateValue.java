package common.practice.program;

import java.util.Scanner;

public class CalculateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to calculate sum");
		System.out.println("press 2 to calculate average");
		System.out.println("press 3 to find square");
		System.out.println("press 4 to find cube");
		System.out.println("press 5 for find squre root");
		System.out.println("press 6 to find even or odd");
		System.out.println("press 7 to find armstrong number");
		System.out.println("press 8 to find armstrong number in given range");
		System.out.println("press 9 to check given character is alphabet or not");
		System.out.println("press 10 to find mean of given number");

		
		
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("enter first number");
			int n1 = sc.nextInt();
			System.out.println("enter second number");
			int n2 = sc.nextInt();
			System.out.println("sum of number: " + (n1 + n2));

			break;

		case 2:
			System.out.println("enter first number");
			int num1 = sc.nextInt();
			System.out.println("enter second number");
			int num2 = sc.nextInt();
			System.out.println("sum of number: " + (num1 + num2) / 2);

			break;

		case 3:
			System.out.println("enter number");
			int num = sc.nextInt();
			System.out.println("square: " + (num * num));
			break;
		case 4:
			System.out.println("enter number");
			int number = sc.nextInt();
			System.out.println("square: " + (number * number * number));
			break;
		case 5:
			System.out.println("enter number");
			double number1 = sc.nextDouble();
			System.out.println("square: " + (Math.sqrt(number1)));
			break;
		case 6:
			System.out.println("enter number");
			int number2 = sc.nextInt();
			checkEvenOdd(number2);
			break;
		case 7:
			System.out.println("enter number");
			int numb = sc.nextInt();
			checkArmstrong(numb);
			break;
		case 8:
			System.out.println("enter number");
			int numb1 = sc.nextInt();
			System.out.println("enter number");
			int numb2 = sc.nextInt();
			checkArmstrongInGivenRange(numb1, numb2);
			break;
			
		case 9:
			System.out.println("enter character");
			char ch = sc.next().charAt(0);
			checkAlphabet(ch);
			break;
			
		case 10:
			System.out.println("enter total number of value");
			int n= sc.nextInt();
			int sum = 0;
			int arr[] = new int[n];
			for(int i = 0; i <n; i++) {
				arr[i] = sc.nextInt();
				sum = sum+arr[i];
			}
			
			System.out.println("mean : " + sum/(double)n);
			break;
		}
		


	}

	public static void checkEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

	public static void checkArmstrong(int num) {
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + (d * d * d);
			num = num / 10;
		}

		if (sum == temp) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");
		}
	}

	public static void checkArmstrongInGivenRange(int num1, int num2) {
		for (int i = num1; i < num2; i++) {
			int check, rem, sum = 0;
			check = i;
			while (check != 0) {
				rem = check % 10;
				sum = sum + (rem * rem * rem);
				check = check / 10;
			}
			if (sum == i) {
				System.out.println("" + i + " is an Armstrong number.");
			}
		}
	}

	public static void checkAlphabet(char str) {
		if ((str >= 'a' && str <= 'z') ||( str >= 'A' && str <= 'Z')) {
			System.out.println("given character is alphabet");
		} else {
			System.out.println("given character is not alphabet");
		}
	}

	
	
}
