package com.yz.test;

public class LonggestCommonPrefix {

	public static String longPrefix(String[] ss) {
		String prefix = "";
	
		if (ss.length < 1 || ss == null) {
			return null;
		}

		if (ss.length < 2) {
			return ss[0];
		}

		prefix = twoComparotor(ss[0], ss[1]);

		if (ss.length == 2) {
			return prefix;
		}

		for (int i = 1; i < ss.length - 1; i++) {
			prefix = twoComparotor(ss[i], prefix);

		}

		return prefix;
	}

	public static String twoComparotor(String s1, String s2) {
		int len = s1.length() <= s2.length() ? s1.length() : s2.length();

		StringBuilder prefix = new StringBuilder();

		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				prefix.append(s1.charAt(i));
			}
		}

		return prefix.toString();
	}

	public static void main(String[] args) {
		String[] strings = { "aaabbbvvvc", "aaabbaaccxx", "aaabbbcxd" };
		System.out.println(longPrefix(strings));
	}
}
