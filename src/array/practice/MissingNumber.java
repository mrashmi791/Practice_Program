package array.practice;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		 n = n+1;
		int expected_sum = n* ((n+1)/2);
		int sum = 0;
		for(int i : arr) {
			sum = sum + i;
		}
			
		System.out.println(expected_sum - sum);
	}

}
