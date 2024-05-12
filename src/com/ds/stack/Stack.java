package com.ds.stack;

import java.util.EmptyStackException;

public class Stack {

	private ListNode top;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public Stack() {
		top = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void push(int data) {

		ListNode tmp = new ListNode(data);
		tmp.next = top;
		top = tmp;
		length++;
	}

	public int pop() {

		if (isEmpty()) {
			throw new EmptyStackException();

		}

		int result = top.data;
		top = top.next;
		length--;
		return result;
	}

	public int peek() {

		if (isEmpty()) {
			throw new EmptyStackException();

		}
		return top.data;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		stack.push(10);
		stack.push(15);
		stack.push(25);
		
		System.out.print(stack.peek());

	}

}
