package string.practice;

import java.util.Scanner;

public class AddBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		String res = "";
		int carry = 0;
		int x = 0;
		
			System.out.println("num1 = "+ num1);
			System.out.println("num2 = "+ num2);
			for(int i = num1.length()-1 ; i >= 0; --i) {
				
				while (num1.length() > num2.length()) {
					num2 = 0+ num2;
				}
				
				 x = (num1.charAt(i)-48) + (num2.charAt(i)-48);
				int rem = x % 10 + carry;
				
				if(rem > 9) {
					rem = rem % 10;
					carry = rem / 10;
				} else {
					carry = x / 10;
				}
				res = rem + res;
				
			}  if(carry > 0) {
				res = carry + res;
			}
			
			System.out.println(res);
	
	}
	}


