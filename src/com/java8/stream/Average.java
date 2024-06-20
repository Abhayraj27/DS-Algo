package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> numsList =  Arrays.asList(1,2,3,4,5);
		 double avg = numsList.stream().mapToInt(e->e).average().getAsDouble();
         System.out.println(avg);
	
	}

}
