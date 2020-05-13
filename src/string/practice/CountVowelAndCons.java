package string.practice;

import java.util.Scanner;

public class CountVowelAndCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		int vowel =0;
		int cons = 0;
		
		for(int i = 0; i < n ; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' || str.charAt(i) == 'u' ||str.charAt(i) == 'A' ||
					str.charAt(i) == 'E' || str.charAt(i) == 'I' ||
					str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowel++;
			} else {
				cons++;
			}
			
		}
		System.out.println("vowel"+vowel);
		System.out.println("constant"+cons);
		sc.close();
	}
	
	

}
