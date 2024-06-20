package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumbersStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = Arrays.asList(2,222,234,567,890,432,236,211,22);
		
		List<Integer> numwith2 =	number.stream().
		               map(e->String.valueOf(e))
		               .filter(e->e.startsWith("2"))
		               .map(Integer::valueOf)
		               .collect(Collectors.toList());
		
		System.out.println(numwith2);
		
		               
		
		

	}

}
