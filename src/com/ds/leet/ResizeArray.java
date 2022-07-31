package com.ds.leet;

public class ResizeArray {

	public void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");

		}
	}

	public int[] getResizeArray(int arr[], int capacity) {

		int temp[] = new int[capacity];

		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		return arr = temp;

	}

	public static void main(String args[]) {

		ResizeArray resizeArray = new ResizeArray();
		// resizeArray.printArray(new int[] {5,1,2,9,10});
		int original[] = new int[] { 5, 1, 2, 9, 10 };
		System.out.println("The size of original array is-" + original.length);
		original = resizeArray.getResizeArray(original, 10);
		System.out.println("The size of original array after resize is-" + original.length);
	}

}
