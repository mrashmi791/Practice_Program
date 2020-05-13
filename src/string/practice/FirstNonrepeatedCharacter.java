package string.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonrepeatedCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String..!!!");
		String str = sc.nextLine();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (m.containsKey(str.charAt(i))) {
				m.put(str.charAt(i), m.get(str.charAt(i)) + 1);
			} else {
				m.put(str.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		sc.close();
	}

}
