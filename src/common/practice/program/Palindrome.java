package common.practice.program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		while(n != 0) {
			int rev = n%10;
			sum = sum *10+rev;
			n = n/10;
		}
		if(temp == sum) {
			System.out.println("Given number is palindrome");
		} else {
			System.out.println("Given number is not palindrome");
		}

	}

}



