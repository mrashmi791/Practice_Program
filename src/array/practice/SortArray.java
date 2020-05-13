package array.practice;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("enter element : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] > arr[i]) 
                {
                   int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
