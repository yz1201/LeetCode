package com.yz.test;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterCombinations {
	private static String[] nums = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz", };

	private static Map<Integer, String> map = new HashMap<>();

	static {
		map.put(2, nums[0]);
		map.put(3, nums[1]);
		map.put(4, nums[2]);
		map.put(5, nums[3]);
		map.put(6, nums[4]);
		map.put(7, nums[5]);
		map.put(8, nums[6]);
		map.put(9, nums[7]);
	}

	public static List<String> findCombinations(String digits) {
		List<String> result = new ArrayList<>();

		if (digits.length() < 1 || digits == null)
			return null;

		char[] cs = digits.toCharArray();

		for (int i = 0; i < digits.length(); i++) {
			if (cs[i] <= 1) {
				continue;
			}

			for (int j = i + 1; j < digits.length(); j++) {

				result.addAll(find2Combinations(Integer.valueOf(String.valueOf(cs[i])),
						Integer.valueOf(String.valueOf(cs[j]))));
			}
		}

		return result;
	}

	public static List<String> find2Combinations(int num, int num2) {
		List<String> list = new ArrayList<>();

		char[] cs = map.get(num).toCharArray();
		char[] cs2 = map.get(num2).toCharArray();

		for (int i = 0; i < cs.length; i++) {

			for (int j = 0; j < cs2.length; j++) {
				list.add(String.valueOf(cs[i]) + String.valueOf(cs2[j]));
			}

		}

		return list;
	}

	public static void main(String[] args) {
		List<String> list = findCombinations("345");
		for (String num : list) {
			System.out.print(num + " ");
		}

		// char c = '3';
		// Integer integer = Integer.valueOf(String.valueOf(c));
		// System.out.println(integer);
		// System.out.println(map.get(integer));
		// System.out.println(c);
	}

}
