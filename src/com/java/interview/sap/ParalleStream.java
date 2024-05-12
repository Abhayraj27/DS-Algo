package com.java.interview.sap;

import java.util.stream.IntStream;

public class ParalleStream {

	public static void main(String args[]) {

		long start = 0;
		long end = 0;

		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();

		System.out.println("Total time taken by plain stream is :" + (end - start));
		
		
		// order of execution is random in parallel stream. Response time is better in Parallel stream.

		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		
       System.out.println("Total time taken by parllel stream is :" + (end - start));

	}

}
