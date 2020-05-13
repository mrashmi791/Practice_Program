package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		Employee emp = new Employee(1,"Ram","BBS",5000);
		Employee emp1 = new Employee(2,"Shyam","Patna",8000);
		Employee emp2 = new Employee(3,"Rani","Hajipur",4000);
		Employee emp3 = new Employee(4,"Prince","Punpun",10000);
		Employee emp4 = new Employee(5,"Shree","Gaya",6535);
		Employee emp5 = new Employee(6,"Puja","BBS",3500);
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
//		 Collections.sort(list);

		   for(Employee em: list){
				System.out.println(em);
		   }
		
		
		System.out.println(list.stream().filter(item ->  item.getSalary()>=5000).map(item -> item.getName()).collect(Collectors.toList()));
		
		List<String> e = list.stream().filter(item ->  item.getSalary() >= 5000).map(item -> item.getAddress()).collect(Collectors.toList());
		for(String item: e) {
			System.out.println(item);
			
		}
		
		Optional<Long> p = list.stream().
				filter(item -> item.getSalary() > 0)
				.map(item-> item.getSalary())
				.max(Comparator.comparing(item -> item));
		System.out.println(p);
		
		System.out.println(list.stream().allMatch(item -> item.getSalary() % 2 == 0));
		System.out.println(list.stream().filter(item -> item.getName().startsWith("S")).collect(Collectors.toList()));
		
		
		list.sort(Comparator.comparing(item -> item.getSalary()));
		list.forEach(item -> {
			System.out.println(item);
		});

	}

}
