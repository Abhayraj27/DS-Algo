package com.ds.leet;

public class MinArray {

	public static int minValue(int arr[]) {

		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException();
		}

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 7, 8, 9, 3 };
		System.out.println(minValue(arr));
	}
}
