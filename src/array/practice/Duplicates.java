package array.practice;

import java.util.Arrays;
import java.util.Scanner;
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int new_length = n;
		for(int i = 0; i < new_length ; i++) {
			for(int j = i+1 ; j < new_length ; j++) {
				if(arr[i] == arr[j]) {
					
					arr[j] = arr[ new_length-1];
                    
					 new_length--;
                     
                    j--;
                    
					int arr1[] = Arrays.copyOf(arr, new_length);
					
				}
			}
		}
		for(int i = 0; i < new_length ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
