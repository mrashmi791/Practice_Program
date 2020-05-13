package array.practice;

import java.util.ArrayList;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(22);
		list.add(54);
		list.add(42);
		list.add(232);
		list.add(541);
		list.add(2);
		list.add(52);
		list.add(54);
		
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
		for(int i = 0; i <list.size()-1;i++) {
			for( int j = i+1; j < list.size();j++) {
				if(list.get(i) == list.get(j)) {
					list.remove(j);
					j--;
				}
			}
		}
System.out.println();
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
		
		

	}

}
