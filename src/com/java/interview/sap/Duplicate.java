package com.java.interview.sap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		
		Set<Integer> result = list.stream().
				collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()
						
						)).entrySet().stream()
				.filter(x->x.getValue()>1).map(Map.Entry::getKey).
				collect(Collectors.toSet());
		System.out.println(result);

	}

}
