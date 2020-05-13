package recursion.practice;

import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
//		display(arr,0,n-1);
		show(arr,0,n-1);
		sc.close();
	}

//	public static void display(int arr[],int start,int n) {
//		if(start == n) {
//			System.out.print(arr[n]+" ");
//		} else {
//			System.out.print(arr[start]+" ");
//			display(arr,start+1,n);
//			System.out.print(arr[start]+" ");
//		}
//	
//	}
	
	public static void show(int arr[], int start, int n) {
		if (start <= n/2) {
			if(start > n/2) {
				return;
			} else {
				show(arr, start + 1, n);
				System.out.print(arr[start] + " ");
				
			}
		} else {
			if(start > n) {
				return;
			} else {
				show(arr, start + 1, n);
				System.out.print(arr[start] + " ");
				
			}
			
		}

	}
	
}
