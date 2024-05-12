package com.java.interview.sap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingAndRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "Hello World";
		
	Map<Character,Long> charCount =	input.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),
				
				LinkedHashMap::new,Collectors.counting()));
	
	Optional<Character> firstNonRepeat =  charCount.entrySet().
			stream().filter((e)->e.getValue()==1).
    map(e->e.getKey()).findFirst();
	
	Optional<Character> firstRepeat = charCount.entrySet().stream().filter((e)->e.getValue()>1).
			map(e->e.getKey()).findFirst();
		
	
	if(firstNonRepeat.isPresent()) {
		
		System.out.println("firstNonRepeat is:"+firstNonRepeat.get());
		
	}
	
	System.out.print(firstRepeat.orElse(null));
		

	
	
	
	}

}
