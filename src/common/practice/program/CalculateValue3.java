package common.practice.program;

import java.util.Scanner;

public class CalculateValue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 to calculate area of isoceles");
		System.out.println("press 2 to calculate perimeter of isoceles");
		System.out.println("press 3 to calculate area of rhombus");
		System.out.println("press 4 to calculate perimeter of rhombus");
		System.out.println("press 5 to calculate volume of cone");
		System.out.println("press 6 to calculate volume of prism");
		System.out.println("press 7 to calculate volume of cylinder");
		System.out.println("press 8 to calculate volume of sphere");
		System.out.println("press 9 to find hcf of two number");
		System.out.println("press 10 to find lcm of two number");

		
		
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("enter number");
			int n1 = sc.nextInt();
			System.out.println("enter number");
			int n4 = sc.nextInt();
			System.out.println("area of isoceles : "+ (n4/4)*Math.sqrt((4*n1*n1)-(n4*n4)));
			
			break;

		case 2:
			System.out.println("enter number");
			int a = sc.nextInt();
			System.out.println("enter number");
			int b = sc.nextInt();
			System.out.println("perimeter of isoceles : "+ 2*(a+b));
			
			break;

		case 3:
			System.out.println("enter length");
			int p = sc.nextInt();
			System.out.println("enter length");
			int q = sc.nextInt();
			System.out.println("area of rhombus : "+ (p*q)/2);
				break;
		case 4:
			System.out.println("enter length");
			int a1 = sc.nextInt();
			System.out.println("perimeter of rhombus: " + (4*a1));
			break;
		case 5:
			System.out.println("enter radius");
			double r = sc.nextDouble();
			System.out.println("enter height");
			double h = sc.nextDouble();

			System.out.println("volume of cone: " + (3.14*r*r )*h/3);
			break;
		case 6:
			System.out.println("enter base");
			double n= sc.nextDouble();
			System.out.println("enter height");
			double n2 = sc.nextDouble();
			System.out.println("volume of prism: " + (n*n2));
			break;
		case 7:
			System.out.println("enter radius");
			double n11 = sc.nextDouble();
			System.out.println("enter side");
			double n33 =sc.nextDouble();
			System.out.println("volume of cylinder: " + (3.14*n11*n11*n33));
		
			break;
		case 8:
			System.out.println("enter radius");
			double nu = sc.nextDouble();

			System.out.println("volume of sphere: " + 4/3*(3.14*nu*nu*nu));
		
			break;
			
		case 9:
			System.out.println("enter first number");
			int j = sc.nextInt();
			System.out.println("enter second number");
			int k = sc.nextInt();
			findHCF(j, k);
			break;
			
		case 10:
			System.out.println("enter first number");
			int j1 = sc.nextInt();
			System.out.println("enter second number");
			int k1 = sc.nextInt();
			findLCM(j1, k1);
		
			break;
		}
		


	}

	public static void findHCF(int num,int num2) {
		int hcf = 1;
		int m = num*num2;
		for(int i=2;i<=m;i++) {
	          
		   if((num%i==0)&& (num2%i==0)) {
			  hcf=i;
		     
		   } 
			 
		   }
		  System.out.println( " hcf : "+hcf);
		}

	
	
	public static void findLCM(int num, int num1) {
		
		int f = 1;
		int t;
		int lcm;
		
		for(int i = 2; i <=num&& i <=num1; i++) {
			if((num%i==0)&& (num1%i==0)) {
				f = i;
			}
			lcm = (num*num1)/f;
			System.out.println("lcm "+ lcm);
		}
		
	}
	
	
}
