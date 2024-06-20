package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLowestShighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(2,22,2,3,4,5,6,7,8,9,8);
		
		// 2nd Highest
		
		int nums2NdHigh = 	nums.stream().
		            sorted(Comparator.reverseOrder())
		            .distinct().limit(2)
		            .skip(1)
		            .findFirst()
		            .get();
		            
		
		System.out.println(nums2NdHigh);
		
		int nums2NdLowest  =	nums.stream()
		.sorted()
		.distinct()
		.skip(1)
		.findFirst()
		.get();
		
		System.out.println(nums2NdLowest);
		
		
		
		

	}

}
