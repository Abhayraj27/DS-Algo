package com.ds.stack;

import java.util.Stack;

public class MinStack {

	Stack<Integer> allData;
	Stack<Integer> minData;

	public MinStack(Stack<Integer> allData, Stack<Integer> minData) {

		allData = new Stack<>();
		minData = new Stack<>();
	}

	int size() {
		return allData.size();

	}

	void push(int val) {
		allData.push(val);

		if (minData.size() == 0 || val < minData.peek()) {
			minData.push(val);
		}

	}

	int pop() {

		if (size() == 0) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			int val = allData.peek();
			if (val == minData.peek()) {
				minData.pop();
			}
			return val;
		}

	}

	int top() {
		if (size() == 0) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			return allData.peek();
		}

	}

	int min() {
		if (size() == 0) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			return minData.peek();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
