package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOfListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
//		Add element at the given position...
		list.add(3,"Wednesday");
		System.out.print(list+" ");
		
//		remove element from list ..
		System.out.println(list.remove(3));
		System.out.print(list+" ");
		System.out.println();
		
//		display array element using advance for loop....
		for(String item: list) {
			System.out.print(item+"-->");
			
		}
		System.out.println();
//		return index position of given object....
		
		int position = list.indexOf("Friday");
		System.out.println(position);
//		return object of list from  the given position...
		System.out.println(list.get(6));
//		return the size of list....
		System.out.println(list.size());
//		Sort the list in ascending order
		Collections.sort(list);
		
		Enumeration<String> e =  Collections.enumeration(list);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
//		Sort the list in descending order
		Collections.sort(list,Collections.reverseOrder());
	

	}

}
