package com.ds.leet;

public class ReverseArray {

	public static void printArray(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public static int[] reverseArrayElement(int arr[], int start, int end) {

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 5, 10, 7, 8 };
		reverseArrayElement(arr, 0, arr.length - 1);
		printArray(arr);
	}

}
