package string.practice;

import java.util.Scanner;

public class DisplayDayOfGivenDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date in dd/mm/yy format : ");
		String da = sc.nextLine();
		String date[] = da.split("/");
		int day = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]);
		int y = Integer.parseInt(date[2]);
		int x = 0, result = 0;
		
		if (y > 400) {
			x = (y - 1) % 400;

		} else {
			x = y - 1;
		}

		int century_odd = x / 100;
		century_odd = century_odd * 5;
		int odd_day = century_odd % 7;
		
		x = x % 100;
		int leap_year = x / 4;
		int ordinary_year = x - leap_year;
		
		odd_day = (leap_year * 2) + ordinary_year + odd_day;
		odd_day %= 7;
		
		result = odd_day;

		switch (m - 1) {

		case 11:
			result = result + 30;
		case 10:
			result = result + 31;

		case 9:
			result = result + 30;
		case 8:
			result = result + 31;
		case 7:
			result = result + 31;
		case 6:
			result = result + 30;
		case 5:
			result = result + 31;
		case 4:
			result = result + 30;
		case 3:
			result = result + 31;
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) ) {
				result = result + 29;
			} else {
				result = result + 28;
			}
		case 1:
			result = result + 31;
		default: result = result + day;
		}

		int k = result % 7;
	
		switch (k) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		}
sc.close();
	}

}
