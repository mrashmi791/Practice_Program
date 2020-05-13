package string.practice;

import java.util.Scanner;

public class RemoveDuplicateUsingMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String....");
		String s = sc.nextLine();
		String[] str = s.split(" ");
		for(int i = 0; i < str.length;i++) {
			if(str[i] != null) {
				for(int j = i+1;j<str.length;j++) {
					if(str[i].equals(str[j])) {
						str[j] = null;
						
					}
				}
			}
		}
		for(int k = 0; k <str.length;k++) {
			if(str[k] != null) {
				System.out.print(str[k]+" ");
			}
		}
		sc.close();
	}
		
	}

