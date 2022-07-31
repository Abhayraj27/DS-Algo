package com.ds.st;

public class MoveAllZeroesToEnd {
	// Input: {1,6,0,3,8,9,0,2}
	// Output: {1,6,3,8,9,2,0,0}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 0, 3, 8, 9, 0, 2 };
		int len = arr.length;
		int count = 0;     //count taking as Index of Array Element.

		for (int i = 0; i < len; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}

		while (count < len) {
			arr[count++] = 0;
		}

		for (int j = 0; j < len; j++) {
			System.out.println(arr[j]);
		}

	}

}
