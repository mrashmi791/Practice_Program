package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CheckKeyExistInMap {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();
		for(int i = 0; i < 5; i++) {
			String str = sc.nextLine();
			
			map.put(i, str);
		}
		
		System.out.println(map);
       } 

	}


