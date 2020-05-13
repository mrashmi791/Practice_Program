package common.practice.program;

import java.util.Scanner;

public class HackerEarthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		int curr = 0;
		boolean isBreak = false;
		String str = "";
		
		for(int i = 1; i <= n ;i++) {
			curr -= 1;
			for(int j = 1; j <= i; j++) {
				
					if(count >= n) {
						isBreak = true;
						break;
					}
				
					curr += 2;
					str = str + curr;
					
					count++;
			}
			
			if(isBreak)
				break;
		}
		
		System.out.println(str);

	}

}
