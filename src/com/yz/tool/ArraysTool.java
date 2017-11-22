package com.yz.tool;

import java.util.HashSet;
import java.util.Set;

public class ArraysTool {

	/**
	 * 数组显示
	 * 
	 * @param <T>
	 * @param nums
	 */
	public static <T> void intArrays(T[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + " ");
		}
	}

	/**
	 * 数组去重
	 * 
	 * @param <T>
	 * @return
	 */

	public static <T> Object[] intArraysDivider(T[] arrays) {
		Set<Object> set = new HashSet<>();
		for (int i = 0; i < arrays.length; i++) {
			set.add(arrays[i]);
		}
		return set.toArray();
	}

	public static <T> boolean arraysCompare(T[] arrays, T[] arrays2) {

		if (arrays == null || arrays2 == null || arrays.length < 1 || arrays2.length < 1)
			return false;

		if (arrays.length != arrays2.length)
			return false;

		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] != arrays2[i]) {
				return false;
			}
		}

		return true;
	}

}
