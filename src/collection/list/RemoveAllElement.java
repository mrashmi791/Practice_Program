package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter size of list");
		int n = sc.nextInt();
		for(int i = 0; i < n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		list.clear();
//		list.removeAll(list);
		System.out.println(list);
	}

}
