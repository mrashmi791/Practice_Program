package common.practice.program;

import java.util.Scanner;

public class CalculateValue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to find sum of digits");
		System.out.println("press 2 for swap number");
		System.out.println("press 3 to find largest of three number");
		System.out.println("press 4 to print table");
		System.out.println("press 5 to calculate sum of arithmetic series");
		System.out.println("press 6 to calculate sum of geometric series");
		System.out.println("press 7 to calculate simple interest");
		System.out.println("press 8 to calculate compound interest");
		System.out.println("press 9 to calculate sum of all prime number in between given range");
		
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("enter first number");
			int n1 = sc.nextInt();
			int sum = 0;
			while(n1 != 0) {
				int d = n1 % 10;
				sum = sum+d;
				n1 = n1 / 10;
			}
			System.out.println(sum);
			
			break;

		case 2:
			System.out.println("enter first number");
			int num1 = sc.nextInt();
			System.out.println("enter second number");
			int num2 = sc.nextInt();
			int temp = num1;
			num1 = num2;
			num2 = temp;			
			System.out.print("num1 : "+num1 + " "+"num2 : "+num2 );

			break;

		case 3:
			System.out.println("enter number");
			int num = sc.nextInt();
			System.out.println("enter number");
			int num4 = sc.nextInt();
			System.out.println("enter number");
			int num5 = sc.nextInt();
			if(num > num4  && num > num5) {
				System.out.println(num);
			} else if(num4 > num5 && num < num4){
				System.out.println(num4);
			} else {
				System.out.println(num5);
			}
			
			break;
		case 4:
			System.out.println("enter number");
			int number = sc.nextInt();
			printTable(number);
			break;
		case 5:
			System.out.println("enter no of term");
			int n5 = sc.nextInt();
			System.out.println("enter first term");
			int a5 = sc.nextInt();
			System.out.println("enter common difference number");
			int d = sc.nextInt();
			System.out.println("Sum is : "+(n5/2*(2*a5+(n5-1)*d)));
		break;
		
		case 6:
			System.out.println("enter no of term");
			double n = sc.nextDouble();
			System.out.println("enter first term");
			double a = sc.nextDouble();
			System.out.println("enter common difference number");
			double r = sc.nextDouble();
			System.out.println("Sum is : "+(Math.pow(a, r)/(n-r)));
		break;
		
		case 7:
			System.out.println("enter amount");
			double p = sc.nextDouble();
			System.out.println("enter time");
			int t = sc.nextInt();
			System.out.println("enter rate");
			double r7 = sc.nextDouble();
			System.out.println("S.I is : "+(p*(1+r7*t)));
		break;
		
		case 8:
			System.out.println("enter amount");
			double p1 = sc.nextDouble();
			System.out.println("enter rate");
			double r8 = sc.nextDouble();
			System.out.println("enter time");
			int t8 = sc.nextInt();
			System.out.println("enter no of time that interest is compounded per unit");
			int n8 = sc.nextInt();
			
			double s = 1+r8/n8;
			System.out.println("Sum is : "+(p1*Math.pow(s, t8*n8)));
		break;
		
		case 9:
			System.out.println("enter range");
			int n9 = sc.nextInt();
			
			System.out.println(primeSum(n9));
		break;
		
		}
	}

	public static void printTable(int num) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num+" + "+i+" "+" = "+num*i);
		} 
	}

	
	public static int primeSum(int num) {
		int sum = 0;
		
		for(int i=num;i >= 1; i--) {
	        boolean isPrime = checkPrime(i);
	        if(isPrime) {
	        	sum = sum+i;
	        }
		}
		return sum;

		}

	private static boolean checkPrime(int number) {
		
		for(int i = 2; i*i <= number;i++) {
			 if(number%i==0) {
				 return false;
			   }
	}
return true;
	}
	
}
