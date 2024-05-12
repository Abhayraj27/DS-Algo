package com.java.interview;

//refrences : https://www.youtube.com/watch?v=Y6B-7ZctiW8

public class MaxProductSubarray {

	public static int maxProduct(int nums[]) {

		int n = nums.length;
		int leftProduct = 1;
		int rightProduct = 1;
		int ans = nums[0];

		for (int i = 0; i < n; i++) {

			leftProduct = leftProduct == 0 ? 1 : leftProduct;
			rightProduct = rightProduct == 0 ? 1 : rightProduct;
			leftProduct *= nums[i];
			rightProduct *= nums[n - 1 - i];

			ans = Math.max(ans, Math.max(leftProduct, rightProduct));

		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] { 2, 3, -2, 4 };
		maxProduct(nums);
	}
}
