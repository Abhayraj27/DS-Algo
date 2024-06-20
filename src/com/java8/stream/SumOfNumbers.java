package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numsList = Arrays.asList(1,2,3,4,5,6,7);
		
		Optional<Integer> sum =	numsList.stream().reduce((a,b)->a+b);
		
		System.out.println("sum is :"+sum.get());
		
		 
		

	}

}
