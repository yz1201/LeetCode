package com.yz.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Administrator
 *
 */
public class PalindromicSubstring {

	/**
	 * 拉出每个子串，判断是不是回文，回文存入集合，再找最长的那串。
	 * 
	 * @param s
	 * @return
	 */
	public static String findLongestPalindromicSubstring(String s) {
		int len = s.length();
		// int start = 0;
		// int end = 0;

		String result = "";
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				String string = s.substring(i, j + 1);

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

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * 动态规划？
	 * 
	 * @return
	 */
	public static String findLongestPalindromicSubstring2() {

		return " ";
	}

	public static void main(String[] args) {
		String string = PalindromicSubstring.findLongestPalindromicSubstring("abcabcbbbbbb");
		System.out.println("answer: " + string);

	}

}
