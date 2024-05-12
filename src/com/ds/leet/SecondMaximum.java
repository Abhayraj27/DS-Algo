package com.ds.leet;

public class SecondMaximum {
	
	

	public static int findSecondMax(int arr[]) {

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];

			} else if (arr[i] > secondMax && arr[i] != max) {

				secondMax = arr[i];

			}

		}
		return secondMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 34, 2, 34, 33 };
		System.out.println(findSecondMax(arr));

	}

}
