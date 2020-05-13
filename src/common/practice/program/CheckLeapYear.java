package common.practice.program;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int y = sc.nextInt();
		
		
		if(y % 4 ==0 || y % 100==0 || y%400 == 0) {
			System.out.println("Given year is leap year");
			
		} else {
			System.out.println("Given year is not leap year");
		}

	}

}



