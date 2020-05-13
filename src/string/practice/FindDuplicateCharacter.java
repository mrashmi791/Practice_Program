package string.practice;

import java.util.Scanner;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String..!!!");
		String str = sc.nextLine();
		int n = str.length();
		int count = 0;
		char[] s = str.toCharArray();
		String d = "";
		
		for(int i = 0; i < n ; i++) {
			for(int j = i+1; j <n;j++) {
				if(s[i]  == s[j]) {
					count++;
					d = d+" "+s[j];
					
				}
			}
			
		}
		System.out.println(d);
		System.out.println("Total duplicate character avaiblable in string is : "+ count);
		sc.close();
	}

}
