package com.ds.leet;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0)
			return "";

		if (strs.length == 1)
			return strs[0];

		int minLength = strs[0].length();

		for (int i = 1; i < strs.length - 1; i++) {
			minLength = Math.min(minLength, strs[i].length());

		}

		for (int i = 0; i < minLength; i++) {

			char current = strs[0].charAt(0);

			for (String str : strs) {

				if (str.charAt(0) != current) {

					return str.substring(0, i);
				}

			}

		}

		return strs[0].substring(0, minLength);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] str = { "flower", "flow", "flight" };
		System.out.println("Longest Common Prefix:" + lcp.longestCommonPrefix(str));

	}

}
