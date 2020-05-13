package string.practice;

import java.util.Scanner;

public class ContainsLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		boolean flag = false;
		for(int i = 0;i<s1.length();i++) {
			if((s1.charAt(i) >=65 && s1.charAt(i) <=90) || (s1.charAt(i) >=95 && s1.charAt(i) <=122)){
				continue;
				
			} else {
				flag  = true;
				break;
			}
		}
		if(!flag ) {
			System.out.println("contains only letter");
		} else {
			System.out.println("not contains only letter");
		}
		sc.close();

	}

}
