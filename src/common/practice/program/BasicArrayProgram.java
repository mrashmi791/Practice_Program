package common.practice.program;

import java.util.Scanner;

public class BasicArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("press 1 to read numbers in array and print");
		System.out.println("press 2 to read numbers in array and print in reverse order");
		System.out.println("press 3 to find smallest element in an array");
		System.out.println("press 4 to find largest element in an array");
		System.out.println("press 5 to find second smallest element in an array");
		System.out.println("press 6 to find second largest element in an array");

		int key = sc.nextInt();
		switch (key) {
		
		case 1:
			System.out.println("enter size");
			int number1 = sc.nextInt();
			int arr[] = new int[number1];
			for(int i = 0; i < number1; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i < number1; i++) {
				System.out.print(arr[i] +" ");
			}
			
			break;
		case 2:
			System.out.println("enter size");
			int a = sc.nextInt();
			int arr1[] = new int[a];
			for(int i = 0; i < a; i++) {
				arr1[i] = sc.nextInt();
			}
			for(int i = a; i >= 0; i--) {
				System.out.print(arr1[0] +" ");
			}
			
			break;
		case 3:
			System.out.println("enter size");
			int a7 = sc.nextInt();
			int arr7[] = new int[a7];
			for(int i = 0; i < a7; i++) {
				arr7[i] = sc.nextInt();
			}
			int min = arr7[0];
			for(int i = 1; i <= a7-1; i++) {
				if(arr7[i] <  min) {
					min = arr7[i];
				}
				
			}
			System.out.print("Smallest = "+min);
			break;
		case 4:
			System.out.println("enter size");
			int a3 = sc.nextInt();
			int arr3[] = new int[a3];
			for(int i = 0; i < a3; i++) {
				arr3[i] = sc.nextInt();
			}
			int max = arr3[0];
			for(int i = 1; i <= a3-1; i++) {
				if(arr3[i] >  max) {
					max = arr3[i];
				}			
			}
			System.out.print("largest = "+max);
			break;
			
		case 5:
			System.out.println("enter size");
			int a9 = sc.nextInt();
			int arr9[] = new int[a9];
			for(int i = 0; i < a9; i++) {
				arr9[i] = sc.nextInt();
			}
			
			for(int i = 0; i < a9; i++) {
				for(int j = i+1;j < a9-1;j++) {
					if(arr9[i] >  arr9[j]) {
						int temp9 = arr9[i];
						 arr9[i] = arr9[j];
						 arr9[j] = temp9;
					}
					
				}
				
			}
			System.out.println("Second smallest number "+arr9[1]);
			break;
			
		case 6:
			System.out.println("enter size");
			int a0 = sc.nextInt();
			int arr0[] = new int[a0];
			for(int i = 0; i < a0; i++) {
				arr0[i] = sc.nextInt();
			}
			
			for(int i = 0; i < a0; i++) {
				for(int j = i+1 ; j < a0-1;j++) {
					if(arr0[i] >  arr0[j]) {
						int temp0 = arr0[i];
						 arr0[i] = arr0[j];
						 arr0[j] = temp0;
					}
					
				}
				
			}
			System.out.println("Second largest number "+arr0[a0-1]);
			break;
		
		}

	}

}
