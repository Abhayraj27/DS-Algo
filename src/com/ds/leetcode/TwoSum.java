package com.ds.leetcode;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {

			int num = nums[i];
			int rem = target - num;

			if (map.containsKey(rem)) {

				int index = map.get(rem);
				if (index == i)  //skip in case same number is on more than one index.
					             //eg: (2,2)=> {0,1}-> if won't skip will return same index{0,0}.
					continue;

				return new int[] { i, index };

			}

		}
		return new int[] {};

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {2,7,11,15}; 
		twoSum(nums, 9);
		System.out.print(twoSum(nums, 9).toString());

	}

}
