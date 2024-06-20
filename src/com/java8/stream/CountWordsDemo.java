package com.java8.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWordsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "My Name is Abhay ,lives in Delhi Delhi  in Delhi Delhi is capital of India";
		
		
	       Map<String,Long> mapCount =
			
			Stream.of(str.split(" ")).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(mapCount);
		
		

	}

}
