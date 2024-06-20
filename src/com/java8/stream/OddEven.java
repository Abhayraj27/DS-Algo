package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		List<Integer> numbers = Arrays.asList(11,2,3,45,67,9,90,87,8,2);
		
		List<Integer> evenList = numbers.stream().
				
		         filter(e->e%2==0).
		         collect(Collectors.toList());
		
		System.out.println(evenList);
		
		List<Integer> oddList = numbers.stream().
				
		         filter(e->e%2!=0).
		         collect(Collectors.toList());
		System.out.println(oddList);
		
		
		

	}

}
