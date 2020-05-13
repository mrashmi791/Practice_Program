package string.practice;

import java.util.Scanner;

public class MergeStringArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array..!!!");
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		System.out.println("Enter element of first array..!!!");
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextLine() ;
		}
		
		System.out.println("Enter size of 2nd array..!!!");
		int m = sc.nextInt();
		sc.nextLine();
		String str[] = new String[m];
		System.out.println("Enter element of first array..!!!");
		for(int i = 0; i < m;i++) {
			str[i] = sc.nextLine() ;
		}
		
		String merge[] = new String[n+m];
		int index = 0;
		for(String s: arr) {
			merge[index] = s;
			index++;
		}
		for(String s: str) {
			merge[index] = s;
			index++;
		}
		for(String s: merge) {
			System.out.print(s+" ");
		}
		sc.close();
	}

}
