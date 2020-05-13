package string.practice;

import java.util.Scanner;

public class MultiplicationOfBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		int num2 = sc.nextInt();
		String res = "";
		int carry = 0;
		int x = 0;
		
			for(int i = num1.length()-1 ; i >= 0; i--) {
				 x = (num1.charAt(i)-48) * (num2);
					int rem = x % 10 + carry;					
					carry = x / 10;	
					res = rem + res;
					
				}  if(carry > 0) {
					res = carry + res;
				}
				
				System.out.println(res);
			}

	}


