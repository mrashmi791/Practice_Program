package common.practice.program;

import java.util.Scanner;

public class CalculateValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to find factorial");
		System.out.println("press 2 to check prime or not");
		System.out.println("press 3 to calculate area of circle");
		System.out.println("press 4 to calculate perimeter of circle");
		System.out.println("press 5 to calculate area of triangle");
		System.out.println("press 6 to calculate perimeter of triangle");
		System.out.println("press 7 to calculate area of rectangle");
		System.out.println("press 8 to calculate perimeter of rectangle");
		System.out.println("press 9 to calculate area of parallelogram");
		System.out.println("press 10 to calculate perimeter of parallelogram");

		
		
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("enter number");
			int n1 = sc.nextInt();
			factorial(n1);
			
			break;

		case 2:
			System.out.println("enter number");
			int num1 = sc.nextInt();
			checkPrime(num1);
			break;

		case 3:
			System.out.println("enter radius");
			double num = sc.nextDouble();
			System.out.println("area of circle : " + (3.14*num * num));
			break;
		case 4:
			System.out.println("enter radius");
			double number = sc.nextDouble();
			System.out.println("perimeter of circle: " + (2 * 3.14 * number));
			break;
		case 5:
			System.out.println("enter height");
			double number1 = sc.nextDouble();
			System.out.println("enter base");
			double number2 = sc.nextDouble();
			System.out.println("enter side");
			double number3 = sc.nextDouble();
			System.out.println("area of triangle: " + (number1*number2)/2);
			break;
		case 6:
			System.out.println("enter height");
			double n= sc.nextDouble();
			System.out.println("enter base");
			double n2 = sc.nextDouble();
			System.out.println("enter side");
			double n3 = sc.nextDouble();
			System.out.println("perimeter of triangle: " + (n+n2+n3));
			break;
		case 7:
			System.out.println("enter base");
			double n11 = sc.nextDouble();
			System.out.println("enter side");
			double n33 = sc.nextDouble();
			System.out.println("area of rectangle: " + (n11*n33));
		
			break;
		case 8:
			System.out.println("enter base");
			double nu = sc.nextDouble();
			System.out.println("enter side");
			double nu1 = sc.nextDouble();
			System.out.println("perimeter of rectangle: " + 2*(nu*nu1));
		
			break;
			
		case 9:
			System.out.println("enter base");
			double j = sc.nextDouble();
			System.out.println("enter side");
			double k = sc.nextDouble();
			System.out.println("area of parallelogram: " + (j*k));
		
			break;
			
		case 10:
			System.out.println("enter base");
			double j2= sc.nextDouble();
			System.out.println("enter side");
			double k2 = sc.nextDouble();
			System.out.println("perimeter of triangle: " + 2*(j2+k2));
		
			break;
		}
		


	}

	public static void checkPrime(int num) {
		for(int i=2;i<=num/2;i++) {
	          
		   if(num%i==0) {
			   System.out.println(num + " is a Prime Number");
		      break;
		   } else {
			   System.out.println(num + " is not a Prime Number");
		   }
		}

	}
	
	public static void factorial(int num) {
		int fact = 1;;
		for(int i = 1; i <=num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial "+ fact);
	}
	
	
}
