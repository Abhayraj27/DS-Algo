package com.ds.leet;

import java.util.HashMap;
import java.util.Map;

public class StringUtil {

	public static int firstNonRepeating(String s) {

		Map<Character, Integer> characterFrequencyMap = new HashMap<>();

		char[] chars = s.toCharArray(); // aba
 
		for (char ch : chars) {

			characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(chars, 0) + 1);

		}

		for (int i = 0; i < chars.length; i++) {

			char chs = chars[i];

			if (characterFrequencyMap.get(chs) == 1) {

				return i;

			}

		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeating("abbcc"));
	}

}
