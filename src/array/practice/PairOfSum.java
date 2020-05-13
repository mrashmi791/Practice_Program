package array.practice;

import java.util.Scanner;

public class PairOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < n-1 ; i++) {
			if(arr[i] + arr[i+1] == digit) {
				System.out.println(arr[i]+" " + arr[i+1]);
			}
		}
	}

}
