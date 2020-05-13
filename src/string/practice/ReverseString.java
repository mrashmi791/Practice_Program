package string.practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String..!!!");
		String str = sc.nextLine();
		int n = str.length();
		char[] arr = str.toCharArray();

		char temp;
		for (int i = 0; i <= n / 2; i++) {
			temp = arr[(n - 1) - i];
			arr[(n - 1) - i] = arr[i];
			arr[i] = temp;
		}
		for (Character ch : arr) {
			System.out.print(ch);
		}
		
		sc.close();
	}

}
