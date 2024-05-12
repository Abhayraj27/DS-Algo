package com.ds.string;

public class Pallindrome {

	public static void main(String[] args) {

		
	
		
		// System.out.println("Hello, World!");
		String word = "";
		char x[] = word.toCharArray();
		int start = 0;
		int end = word.length() - 1;
		while (start < end) {

			if (x[start] != x[end]) {

				System.out.print("Not Pallindrome");
			}
			start++;
			end--;
		}

		System.out.print("String is Pallindrome");

	}
}