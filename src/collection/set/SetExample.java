package collection.set;


import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<String> s = new HashSet<>();
		System.out.println("Enter size of set : ");
		int n = sc.nextInt();
		for(int i = 0; i <= n;i++) {
			String s1 = sc.nextLine();
			s.add(s1);
		}
		System.out.println(s);
		s.add("monday");
		System.out.println(s);
		
	}

}
