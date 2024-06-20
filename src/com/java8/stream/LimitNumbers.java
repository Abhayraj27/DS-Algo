package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(2,22,2,3,4,5,6,7,8,9,8);
		
		List<Integer> numsLimit = nums.stream().limit(5).collect(Collectors.toList());
		
		System.out.println(numsLimit);
		
		 int sum = nums.stream().limit(5).reduce((a,b)->a+b).get();
		 
		 System.out.println(sum);
		

	}

}
