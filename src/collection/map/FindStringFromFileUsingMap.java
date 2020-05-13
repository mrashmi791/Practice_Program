package collection.map;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindStringFromFileUsingMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader freader = new FileReader("C:/Users/Arpan/Desktop/p.txt");
		BufferedReader br = new BufferedReader(freader);
		String s ;
		Map<String, Integer> map = new HashMap<String, Integer>();
		String str2 =  "hello";
		while((s = br.readLine()) != null) {
//		System.out.println(s);

		String[] s1 = s.split(" ");
		for(int i = 0 ; i < s1.length; i++) {
			String str = s1[i];
			if(map.containsKey(str)&&str.equals(str2)) {
		    int count=(Integer)map.get(str);
		    map.put(str,(i+1));
		    }
		    else
		    map.put(str, 1);
		}
			 
		
			 for (Map.Entry entry : map.entrySet()) { 
		            System.out.println(entry.getKey() + " " + entry.getValue()); 
		        } 
		
//	      System.out.println(map.get(s));
	}
	}
}
