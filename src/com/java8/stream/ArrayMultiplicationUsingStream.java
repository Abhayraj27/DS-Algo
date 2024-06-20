package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class ArrayMultiplicationUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] inputArray = {1,2,3,4,5};
		
		List<Integer> numberList = Arrays.asList(inputArray);
		
		Integer prodList = numberList.stream().reduce((a,b)->a*b).get();
		
		System.out.println(prodList);
		
	}

}
