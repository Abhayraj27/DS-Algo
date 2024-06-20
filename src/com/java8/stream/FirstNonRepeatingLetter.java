package com.java8.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abhayb";
		
	Character chCount = 	str.chars().mapToObj(e-> Character.valueOf((char)e))
		
		.collect(Collectors.groupingBy(Function.identity(),
				LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1)
		.map(entry->entry.getKey())
		.findFirst()
		.get();
		
	
	System.out.println(chCount);
		

	  	
		
		
		
		

	}

}
