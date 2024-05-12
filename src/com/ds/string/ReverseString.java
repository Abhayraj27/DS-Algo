package com.ds.string;
import java.util.Stack;

public class ReverseString {
	
	
	public Static String reverse(String str) {
		
		
	}

	 public static void main(String[] args) {
	        String str = "Abhay";
	        char[] charArray = str.toCharArray();
	        Stack<Character> stack =  new Stack<Character>();
	        for(char ch:charArray){
	            stack.push(ch);
	            }
	            for(int i=0;i<charArray.length-1;i++){
	             charArray[i]  = stack.pop();
	        }
	            
	         
	    }
	}

