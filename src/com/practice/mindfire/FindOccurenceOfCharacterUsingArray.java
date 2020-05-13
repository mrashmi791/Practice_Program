package com.practice.mindfire;

import java.util.Scanner;

public class FindOccurenceOfCharacterUsingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int arr[] = new int[255];
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch] = arr[ch]+1;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println((char)i + "=" + arr[i]);
			}
		}

		sc.close();
	}

}
