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
	
	  public static int reverse(int x) {
	        long tmp = x;
	        // ·ÀÖ¹½á¹ûÒç³ö
	        long result = 0;

	        while (tmp != 0) {
	            result = result * 10 + tmp % 10;
	            tmp = tmp / 10;
	        }

	        // Òç³öÅĞ¶Ï 
	        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
	            result = 0;
	        }

	        return (int) result;
	    }

	public static void main(String[] args) {
//		System.out.println(reverse(-10001));
		
		System.out.println(100/10/10/10);
	}
}
