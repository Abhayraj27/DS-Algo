package com.ds.leet;

public class ArrayUtil {

	public int printArray(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			System.out.println(arr[i] + " ");

		}
		return n;

	}

	public void arrayDemo() {
		int myArray[] = new int[5];
		myArray[0] = 5;
		myArray[1] = 5;
		myArray[2] = 5;
		myArray[3] = 5;
		myArray[4] = 5;
		myArray[4] = 5;
		printArray(myArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayUtil arrayUtil = new ArrayUtil();
		arrayUtil.arrayDemo();

	}

}
