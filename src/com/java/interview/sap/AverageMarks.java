package com.java.interview.sap;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = {20,50,99,12,94};
		
		List<Integer> marksList = Arrays.asList(20,50,99,12,94);
		OptionalDouble avgMarks = marksList.stream().mapToInt(num->num.intValue()).average();
		System.out.println("Average marks:"+avgMarks);

	}

}
