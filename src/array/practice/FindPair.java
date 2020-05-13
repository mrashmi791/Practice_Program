package array.practice;

import java.util.Scanner;

public class FindPair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for 1st array");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter 1st array element");
		for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
		System.out.println("Enter value for find....");
		int v = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i]+arr[j] == v) {
					System.out.println("( "+arr[i]+","+arr[j]+" ) ");
				}
			}
		}
	}

}
