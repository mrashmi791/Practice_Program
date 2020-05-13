package common.practice.program;

import java.util.Scanner;

public class AryaAndWar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		while(n > 0) {
			d = d + n%2;
			n = n/2;
		}
		
		System.out.println(d);
		sc.close();
	}

}
