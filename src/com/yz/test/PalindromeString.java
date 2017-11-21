package com.yz.test;

public class PalindromeString {

	public static boolean findPalindromeString(int num) {

		if (num < 0) {
			return false;
		}

		if (isPalindrome(num)) {
			return true;
		}

		return false;
	}

	private static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub

		if (num == reverse(num))
			return true;
		return false;
	}

	public static int reverse(int num) {
		int result = 0;

		while (num != 0) {
			result = result * 10 + num % 10;
			num = num / 10;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(findPalindromeString(124421));

		
	}
}
