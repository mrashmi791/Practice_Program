package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter second word ");
		String str2 =  sc.nextLine();
		boolean flag = false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		
		for(int i = 0 ; i < str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))) {
				 map.put(str.charAt(i), map.get(str.charAt(i)) + 1 );
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (int k = 0; k < str2.length(); k++){

		    if(map.containsKey(str2.charAt(k)) ) {
		    	 int count = map.get(str2.charAt(k));
		    	 map.put(str2.charAt(k), count - 1);

		    } else {
		    	System.out.println("not anagram");
		    	break;
		    }
		}
		for(Map.Entry<Character, Integer> element: map.entrySet()) {
			if(element.getValue() != 0) {
				flag = true;

			}
		}
		if(flag) {
			System.out.println("Not Anagram");
		} else {
			System.out.println("Anagram");
            
		}
		

	}

}
