package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionList {
	
	private static List<String> list = new ArrayList<>();
	
	private static void printlist(List<String> list ) {
		System.out.println(list);
	}

	public static void main(String[] args) {
		list.add("IBM");
		list.add("JAVA");
		list.add("ACADEMY");
	
		
		printlist(list);
		
		String first = list.get(0);
		System.out.println(first);
		
		list.remove(0);
		System.out.println(list);
		
		String[] arr = { "victor", "herrera"};
		List<String> name = Arrays.asList(arr);
		System.out.println(name);
		
		
		//list.addAll(c)
		
		
		
	}

}
