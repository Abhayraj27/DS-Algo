package com.ds.st;

public class BubbleSort {

	public static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 1, 6, 4, 2 };
		
		// Time complexity: O(n^2)

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
		printArray(arr);

	}

}
