package recursion.practice;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		int count = 1;
		table(num,count);
		sc.close();
	}
	public static void table(int num,int counter) {
		if (counter<=10) {
	         System.out.println(num+" x "+counter+" = "+num*counter);
	         table(num,++counter);
	      }
	}
}
