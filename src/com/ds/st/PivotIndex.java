package com.ds.st;

public class PivotIndex {

	public static int pivot_index(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		int leftSum = 0;
		int rightSum = sum;
		for (int i = 0; i < arr.length; i++) {
			rightSum = rightSum - arr[i];

			if (leftSum == rightSum) {
				return i;

			}
			leftSum += arr[i];
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 7, 6, 5, 6 };
		System.out.println(pivot_index(arr));

	}

}
