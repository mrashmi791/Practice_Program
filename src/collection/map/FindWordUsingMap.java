package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindWordUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter word to find ");
		String str2 =  sc.nextLine();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String item[] = str.split(" ");
		
		for (int i = 0; i < item.length ; i++) {
				String s = item[i];
	         if (map.containsKey(str2) && s.equals(str2)) {
	            map.put(str2, map.get(str2)+1 );
	         } else if(s.equals(str2)){
	            map.put(str2,1);
	         }
	      }
	      System.out.println(map.get(str2));
	}

}
