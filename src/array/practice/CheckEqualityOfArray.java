package array.practice;

import java.util.Scanner;

public class CheckEqualityOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for 1st array");
		int n = sc.nextInt();
		System.out.println("Enter size for 2nd array");
		int m = sc.nextInt();
		int arr[][] = new int[n][n];
		int arr2[][] = new int[m][m];
		boolean flag = false;
		System.out.println("Enter 1st array element");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("Enter 2nd array element");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = sc.nextInt();
			}

		}
		if (n != m) {
			flag = true;
			return;
		} else {
			for (int i = 0; i < n; i++) {

				if (arr[i] != arr2[i]) {
					flag = true;
					break;
				}
			}

		}
		if (flag) {
			System.out.println("not equal");
		} else {
			System.out.println("equal");
		}
	}

}
