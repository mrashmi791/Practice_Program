package common.practice.program;

import java.util.Scanner;

public class NumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int rev =0;
		while(n > 0) {
			int d = n % 10;
			 rev = rev * 10 + d;
			 n = n / 10;
		}
		 while(rev > 0) {
			 int r = rev%10;
			 rev = rev/10;
		
			switch(r) {
			case 0: System.out.print("Zero ");
			break;
			case 1: System.out.print("One ");
			break;
			case 2: System.out.print("Two ");
			break;
			case 3: System.out.print("Three ");
			break;
			case 4: System.out.print("Four ");
			break;
			case 5: System.out.print("Five ");
			break;
			case 6: System.out.print("Six ");
			break;
			case 7: System.out.print("Seven ");
			break;
			case 8: System.out.print("Eight ");
			break;
			case 9: System.out.print("Nine ");
			break;
			}
		 }
		}

	}


