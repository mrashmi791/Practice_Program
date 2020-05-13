package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class RemoveEntryByValue {

	@SuppressWarnings("unlikely-arg-type")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		String str = sc.nextLine();
//		char value = sc.nextLine().charAt(0);
		for(int i = 0; i < str.length(); i++) {
			map.put(i,str.charAt(i));
			
		}
		
		map.entrySet()
		   .removeIf(
		       entry -> ("2".equals(""+entry.getKey())));
		
		System.out.println(map);
	
		
	}

}
