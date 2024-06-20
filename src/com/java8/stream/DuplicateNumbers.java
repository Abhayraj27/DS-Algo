package com.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(2,22,2,3,4,5,6,7,8,9,8);
		
		Set<Integer> setNum =  nums.stream()
                     .filter(e->Collections.frequency(nums,e)>1)
                     .collect(Collectors.toSet());
        
        
        System.out.println(setNum);
		
		
		

	}

}
