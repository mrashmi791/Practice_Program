package string.practice;

import java.util.Scanner;

public class NonRepeated {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		char[] s = str.toCharArray();

		for(int i = 0; i < n ; i++) {
			 boolean check = true;
			for(int j = i+1; j < n;j++) {
				if(s[i]  == s[j]) {
					check = false;
					
					break;
				}
				
			}
			if(check) {
				System.out.println(s[i]);
				break;
			}
			
		}
		
	}

}
