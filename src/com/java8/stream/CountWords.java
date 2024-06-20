package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("abhay","raj","abhay","abc","abc","abc");
		
	Map<String,Long> mapCount =	list.stream().collect(Collectors.
				
				
				groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(mapCount);
		
		
		

	}

}
