
package com.striver.ds;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		int arr[] = { 1, 2, 2, 3, 3, 3 };
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				
				arr[i + 1] = arr[j];
				i++;
				
			}
			
		}
	
			System.out.println(arr[i]);

		
	}

}
