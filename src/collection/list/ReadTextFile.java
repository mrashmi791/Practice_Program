package collection.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File("C://Users//Arpan//Desktop//p.txt"));
		ArrayList<String> list = new ArrayList<>();
		String str = "";
		while(sc.hasNext()) {
			str = str + sc.next();
			
		}
		list.add(str);
		System.out.println(list);
		sc.close();
		
	}

}
