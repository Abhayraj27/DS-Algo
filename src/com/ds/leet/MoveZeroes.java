package com.ds.leet;

public class MoveZeroes {

	public static int printArray(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			System.out.println(arr[i] + " ");

		}
		return n;

	}

	public static void moveZeroesAtEnd(int arr[]) {
		int j = 0; // focus on zeroth element
		// i-> will focus on non zero element.

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 7, 0, 3, 4, 1, 0, 3 };

		moveZeroesAtEnd(arr);
		printArray(arr);
	}

}
