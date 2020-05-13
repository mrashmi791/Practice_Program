package string.practice;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String..!!!");
		String s = sc.nextLine();
		 String[] str = s.split(" ");
		String result="";
		for(String s1:str ) {
			result = result + reverse(s1)+" ";
		}
		
			System.out.println(result.toString());
			sc.close();
		
	}
	public static String reverse(String s1) {
		String rev="";
		for(int i = s1.length()-1;i >=0;i--) {
			rev = rev+s1.charAt(i);
		}
		return rev;
		
	}

}
