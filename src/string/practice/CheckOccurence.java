package string.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		char ch = sc.next().charAt(0);
		int count = 0;		
//		for(int i = 0; i < n ; i++) {
//			
//				if(str.charAt(i) == ch) {
//					count++;
//				}
//			}
		
		Map<Character, Integer> m = new HashMap<Character,Integer>();
		char[] str1 = str.toCharArray();
		for(char c : str1) {
			if(m.containsKey(c)) {
				 m.put(c, m.get(c)+1);
				
			} else {
				m.put(c, 1);
			}
			
		}
//		System.out.println();
		System.out.println(count);

		
		}
	}


