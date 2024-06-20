package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsBeginningWith {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // find all words beginning with #
		
	
		//frequency of each word
		
//        "the #apple one with",
//        "the #banana one with",
//        "the #cat #dog one with"
		
		
		
	       String[] lines = new String[]{
	    		   
	                "the #apple one with",
	                "the #banana one with",
	                "the #cat #dog one with"
	                
	                };
	       
	       
	       List<String> res = Arrays.stream(lines)
	    		              .map(line->line.split(" "))
	    		              .flatMap(words->Stream.of(words))
	    		              .filter(word->word.startsWith("#"))
	    		              .collect(Collectors.toList());
	       
	  
	       
	       
	       System.out.println(res);
	       
	       
	    		              
	    		 }

}
