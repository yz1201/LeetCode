package com.yz.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PalindromicSubstring {

	public static String findLongestPalindromicSubstring(String s) {
		int len = s.length();
		// int start = 0;
		// int end = 0;

		String result = "";
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				String string = s.substring(i, j + 1);
				System.out.println("substrings: " + string);
				if (isPalindromic(string)) {
					map.put(string.length(), string);
				}
			}
		}

		Set<Integer> set = map.keySet();
		for (Integer integer : set) {
			System.out.println(integer);
		}

		System.out.println(map.get(3));
		int maxNum = Collections.max(set);

		result = map.get(maxNum);
		return result;
	}

	public static boolean isPalindromic(String string) {
		if (string.length() < 3) {
			return false;
		}

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		String string = PalindromicSubstring.findLongestPalindromicSubstring("abcb");
		System.out.println(string);

	}

}
