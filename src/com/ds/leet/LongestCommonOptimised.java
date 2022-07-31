package com.ds.leet;

public class LongestCommonOptimised {

	public String longestCommonPrefix(String[] strs) {

		if (strs.length == 0)
			return "";

		String prefix = strs[0];           //"flower", "flow", "flight"

		for (int i = 0; i < strs.length; i++) {

			while (strs[i].indexOf(prefix) != 0) {

				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty())
					return "";

			}

		}

		return prefix;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestCommonOptimised lcp = new LongestCommonOptimised();
		String[] str = { "flower", "flow", "flight" };
		String[] str1 = { "dog", "racecar", "car" };
		System.out.println("Longest Common Prefix:" + lcp.longestCommonPrefix(str));
		System.out.println("Longest Common Prefix:" + lcp.longestCommonPrefix(str1));

	}

}
