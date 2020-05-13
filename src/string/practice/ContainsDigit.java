package string.practice;

import java.util.Scanner;

public class ContainsDigit {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(str.matches("[0-9]+") && str.length()>2) {
			System.out.println("contains only digit");
		} else {
			System.out.println("contains character");
		}

	}

}
