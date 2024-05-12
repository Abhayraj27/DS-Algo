package com.ds.array;

public class RemoveDuplicateElement {

	public static int filterDuplicate(int arr[], int n) {
        int i = 0;
       for (int j = 0; i < n; i++) {
           if (arr[i] != arr[j]) {
        	   arr[i + 1] = arr[j];
        	   i++;
				}}
       System.out.println(arr[i]);
		return i + 1;}
public static void main(String[] args) {
	
	int arr[] = {1,1,3,5,6};

	filterDuplicate(arr,4);

	}

}
