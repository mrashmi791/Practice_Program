package string.practice;

import java.util.Scanner;

public class ContainDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		boolean flag = false;
		for(int i = 0;i<s1.length();i++) {
			if(s1.charAt(i) >=48 && s1.charAt(i) <=57) {
				continue;
				
			} else {
				flag  = true;
				break;
			}
		}
		if(!flag ) {
			System.out.println("contains only digits");
		} else {
			System.out.println("not contains only digits");
		}
		sc.close();
	}

}
