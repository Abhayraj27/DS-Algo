package com.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReusingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		   String inputArray[] = {"Amit","ball","call","Amit","egg"};
//		
//		  Stream<String> inputstream =   Arrays.asList(inputArray).stream();
//		  
//		  inputstream.forEach(e->System.out.println(e));
		  
		 // long count = inputstream.filter(null);
		  
		  String word = "javaj";
		  
		  Character res = word.chars().mapToObj(cha->Character.valueOf((char)cha)).
				collect(Collectors.groupingBy(letter->letter,LinkedHashMap::new,
						Collectors.counting())).
				entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(entry->entry.getKey())
				.findFirst().get();
		  
		  System.out.println(res);
		  
		  
		  
		  
		  
				
				
		  
		  
		  
		  
		
		
		

	}

}
