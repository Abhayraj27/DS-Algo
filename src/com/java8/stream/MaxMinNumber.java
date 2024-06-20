package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<Integer> nums = Arrays.asList(2,22,2,3,4,5,6,7,8,9,8);
		
	       int max =	nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		  System.out.println(max);
		  
		  int min = nums.stream().min(Comparator.comparing(Integer::valueOf)).get();
		  System.out.println(min);
		
		
		}

}
