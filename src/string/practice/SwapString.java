package string.practice;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String temp = s1;
		s1 = s2;
		s2 = temp;

//		s1 = s1 + s2;
//
//		s2 = s1.substring(0, s1.length() - s2.length());
//
//		s1 = s1.substring(s2.length());
		System.out.println("s1 : " + s1 + ",  s2 : " + s2);
		sc.close();
	}

}
