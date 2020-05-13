package array.practice;

import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int larg = arr[0];
		int small = arr[0];
		for(int i = 1 ; i < n;i++) {
			if( larg < arr[i]) {
				larg = arr[i];
			} else if(small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("large " + larg);
		System.out.println("small " + small);
	}

}
