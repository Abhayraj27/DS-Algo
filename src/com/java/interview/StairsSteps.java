package com.java.interview;



//There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a
//time. Given N, write a function that returns the number of unique ways you can
//climb the staircase. The order of the steps matters.
//
//example:
//if N is 4, then there are 5 unique ways:
//
//1, 1, 1, 1
//2, 1, 1
//1, 2, 1
//1, 1, 2
//2, 2

//Solutions : https://www.geeksforgeeks.org/count-ways-reach-nth-stair/

public class StairsSteps {

	// A simple recursive program to find
    // n'th fibonacci number
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    // Returns number of ways to reach s'th stair
    static int countWays(int s)
    {
        return fib(s + 1);
    }
 
    /* Driver program to test above function */
    public static void main(String args[])
    {
        int s = 4;
        System.out.println("Number of ways = " + countWays(s));
    }

}
