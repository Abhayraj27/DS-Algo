package com.ds.stack;

import java.util.Stack;

public class StringReverse {

	public static String reverse(String str) {

		Stack<Character> stack = new Stack<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {

			stack.push(c);

		}
		
		for(int i=0;i<str.length();i++) {
			ch[i]= stack.pop();
		}
		return new String(ch);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Abhay";
		System.out.println(str);
		System.out.println(reverse(str));

	}

}
