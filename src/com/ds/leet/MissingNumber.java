package com.ds.leet;

public class MissingNumber {

	public int findMissingNumber(int arr[]) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;

		for (int num : arr) {

			sum = sum - num;
		}
		return sum;

	}

	public void arrayDemo() {

		int[] arr = { 1, 3, 6, 8, 4, 2, 7 };
		System.out.println(findMissingNumber(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MissingNumber missingNumber = new MissingNumber();

		missingNumber.arrayDemo();

	}

}
