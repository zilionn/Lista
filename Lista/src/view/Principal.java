package view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(list.indexOf("Bob"));
		
		for (String x : list) {
			System.out.println(x);
		}
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String y : result ) {
			System.out.println(y);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
