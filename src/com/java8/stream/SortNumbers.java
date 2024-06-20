package com.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(2,22,2,3,4,5,6,7,8,9,8);
		List<Integer> numsSorted = nums.stream().sorted().collect(Collectors.toList());
		
		System.out.println(numsSorted);
		
		List<Integer> numsSortedRev = nums.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(numsSortedRev);

	}

}
