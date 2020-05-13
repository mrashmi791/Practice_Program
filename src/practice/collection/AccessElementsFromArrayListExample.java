package practice.collection;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {

		 List<String> topProgrammingLanguages = new ArrayList<>();

	        System.out.println("Is the topProgrammingLanguages list empty? : " + topProgrammingLanguages.isEmpty());

	        topProgrammingLanguages.add("C");
	        topProgrammingLanguages.add("Java");
	        topProgrammingLanguages.add("C++");
	        topProgrammingLanguages.add("Python");
	        topProgrammingLanguages.add(".net");
	       
	        System.out.println("Here are the top " + topProgrammingLanguages.size() + " Programming Languages in the world");
	        System.out.println(topProgrammingLanguages);

	        String bestProgrammingLang = topProgrammingLanguages.get(1);
	        String secondBestProgrammingLang = topProgrammingLanguages.get(1);
	        String dotNetProgrammingLang = topProgrammingLanguages.get(topProgrammingLanguages.size() - 1);

	        System.out.println("best Programming Lang: " + bestProgrammingLang);
	        System.out.println("Second Best Programming Lang: " + secondBestProgrammingLang);
	        System.out.println("Dot Net Programming Lang: " + dotNetProgrammingLang);

	        topProgrammingLanguages.set(4, "C#");
	        System.out.println("Modified top Programming Languages list: " + topProgrammingLanguages);
	    
	}

}
