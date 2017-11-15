package com.yz.test;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public class LongestSubstring {

	// Ŀ�ģ�������ظ����ַ������ȣ�eg:"aaabbced", result = 3;
	public static int getNoRepeatingSubstring(String s) {

		// �ַ������벻�Ϸ�
		if (s == null) {
			return 0;
		}
		int len = s.length();

		// ��ǰ����Ŀ�ʼλ��
		int start = 0;
		// ��¼���������ظ��Ӵ�����
		int result = 0;
		// ���ʱ�ǣ���¼����һ�η��ʵ��ַ���λ��
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
			// ����ַ��Ѿ����ֹ�(�ڱ�ǿ�λ������)�������±��start
			if (map.containsKey(ch) && map.get(ch) >= start) {
				System.out.println("i: " + i + " start: " + start);
				start = map.get(ch) + 1;
			}
			// ���û�г��ֹ��������ķ��ظ��Ӵ��ĳ���
			else {
				result = Math.max(result, i - start + 1);
			}

			// ���·��ʼ�¼
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
