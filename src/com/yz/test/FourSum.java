package com.yz.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {

	public static List<List<Integer>> sum2Target(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();

		int len = nums.length;
		if (nums.length < 4) {
			try {
				throw new Exception("Sorry, you are too short!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		for (int i = 0; i < len; i++) {

		}

		return null;
	}

	public static List<List<Integer>> threeSumTool(int[] num, int target) {
		Arrays.sort(num);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1, k = num.length - 1; j < k;) {
				if (num[i] + num[j] + num[k] == target) {
					List<Integer> l = new ArrayList<Integer>();
					l.add(num[i]);
					l.add(num[j]);
					l.add(num[k]);
					if (set.add(l))
						list.add(l);
					j++;
					k--;
				} else if (num[i] + num[j] + num[k] < target)
					j++;
				else
					k--;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		int[] nums = { 1, 2, 4 };

		sum2Target(nums, 5);
	}

}
