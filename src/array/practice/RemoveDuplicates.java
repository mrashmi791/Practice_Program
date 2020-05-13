package array.practice;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n ; i++) {
			for(int j = i+1; j < n ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		int temp[] = new int[n];
		int j =0;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		for(int i = 0; i <n; i++) {
			arr[i] = temp[i];
			System.out.println(arr[i]);
		}
		
	}

}
