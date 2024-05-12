package com.ds.leet;

import java.util.HashMap;

public class TwoSum {



	public int[] twoSum(int nums[], int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// nums ={2,7,11,5}; target = 9
		// output = [0 1]
		// 9-2 = 7 // complement
		// Key: 2,7,11,15 value: 0,1,2,3
 
		for (int i = 0; i < nums.length; i++) {

			map.put(nums[i], i); // 5 3 t= 8
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement) && (map.get(complement) != i)) {
				return new int[] { map.get(complement) };

			}

		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 2, 7, 11, 5 };
		TwoSum twoSums = new TwoSum();
		System.out.println(twoSums.twoSum(nums, 8));
		//System.out.println(printArray(nums));
		
	}
}
