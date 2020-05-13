package string.practice;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String..!!!");
		String str = sc.nextLine();
		int count = 0;
		for(int i = 0; i < str.length();i++) {
			if((str.charAt(i) >=65 && str.charAt(i) <=90)||(str.charAt(i) >=97 && str.charAt(i) <=122) ) {
				count++;
			}
		}
		System.out.println("Total word in given string is : "+count);
		sc.close();
	}

}
