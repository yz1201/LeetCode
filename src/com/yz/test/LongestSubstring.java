package com.yz.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public class LongestSubstring {

	// 目的：求最大不重复的字符串长度，eg:"aaabbced", result = 3;
	public static int getNoRepeatingSubstring(String s) {

		// 字符串输入不合法
		if (s == null) {
			return 0;
		}
		int len = s.length();

		// 当前处理的开始位置
		int start = 0;
		// 记录到的最大非重复子串长度
		int result = 0;
		// 访问标记，记录最新一次访问的字符和位置
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
			// 如果字符已经出现过(在标记开位置算起)，就重新标记start
			if (map.containsKey(ch) && map.get(ch) >= start) {
				System.out.println("i: " + i + " start: " + start);
				start = map.get(ch) + 1;
			}
			// 如果没有出现过就求最大的非重复子串的长度
			else {
				result = Math.max(result, i - start + 1);
			}

			// 更新访问记录
			map.put(ch, i);
			System.out.println("map size: "+map.size());
		}
		return result;

	}

	public static void main(String[] args) {
		int len = LongestSubstring.getNoRepeatingSubstring("sssssssb");
		System.out.println(len);
	}
}
