package com.java8.stream;

public class CharOccurenceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Abhay raj";
		long count = str.chars().filter(e->(char)e=='a').count();
		
		System.out.println(count);
		

		

	}

}
