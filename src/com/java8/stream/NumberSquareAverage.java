package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numsList = Arrays.asList(1,10,20,15,30);
		
		double avg = numsList.stream().
		       map(e->e*e).
		       filter(e->e>100).
		          mapToInt(e->e).
		             average()
		             .getAsDouble();
		
		System.out.println("avg is :"+avg);
		
}

}
