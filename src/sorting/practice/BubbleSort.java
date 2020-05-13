package sorting.practice;

import java.util.Scanner;

public class BubbleSort {
	
	public static int[] sort(int arr[] ) {
		boolean isSorted = true;
		for(int i = 0;i < arr.length-1 && isSorted; i++) {
			isSorted = false;
			for(int j = 0;j < arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					isSorted = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		
//		for(int i = 0;i < n-1; i++) {
//			for(int j = 0;j < n-i-1;j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		for(int x : arr) {
			System.out.print(x +" ");
		}
	}

}
