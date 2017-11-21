package com.yz.test;

import java.util.HashMap;
import java.util.Map;

public class ReverseInteger {

	public static int reverseNum(int num) {

		if (num == Math.abs(num)) {
			return helper(num);
		} else {
			return -helper(-num);
		}

	}

	public static int helper(int num) {
		int answer = 0;
		int i = 0;
		Map<Integer, Integer> nums = new HashMap<>();
		while (num > 0) {
			nums.put(i, num % 10);
			num = num / 10;
			i++;
		}

		for (int x = 0; x < nums.size(); x++) {
			answer += (int) (nums.get(nums.size() - x - 1) * Math.pow(10, x));
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(reverseNum(-12222228));
	}
}
