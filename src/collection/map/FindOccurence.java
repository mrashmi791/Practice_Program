package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < str.length() ; i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		
		 for (Map.Entry< Character, Integer > entry : map.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
			
	            
	        } 
	}

}
