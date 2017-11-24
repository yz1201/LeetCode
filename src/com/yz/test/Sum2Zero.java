package com.yz.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.yz.tool.ArraysTool;

public class Sum2Zero {

	/**
	 * failed!@dbdj1201
	 * 
	 * @param nums
	 * @return
	 */
	public static Set<Integer[]> sum2Zero(Integer[] nums) {
		if (nums.length < 3) {
			return null;
		}

		Set<Integer[]> answer = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length - 2; k++) {
					Integer[] ans = new Integer[3];
					if (sum320(nums[i], nums[j], nums[k])) {
						System.out.println("add ?");
						if (nums[i] != nums[j]) {
							ans[0] = nums[i];
							ans[1] = nums[j];
							ans[2] = nums[k];
							answer.add(ans);
						}
					}
				}
			}
		}
		return answer;
	}

	public static boolean sum320(int num, int num2, int num3) {
		if (num + num2 + num3 == 0)
			return true;
		return false;
	}

	/**
	 * copy method
	 * 
	 * @param nums
	 * @return
	 */

	public static List<List<Integer>> threeSum2(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int length = nums.length;
		if (length < 3) {
			return result;
		}
		Arrays.sort(nums);

		System.out.println(length);

		int i = 0;
		while (i < length - 2) {

			if (nums[i] > 0)
				break;
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				System.out.println("i-j-k: " + i + j + k);
				int sums = nums[i] + nums[j] + nums[k];

				if (sums == 0) {
					
					System.out.println("add :");
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));
					++i;
					break;
				}

				if (sums < 0) {
					// 消去左侧重复的数字
					while (nums[j] == nums[++j] && j < k)
						;
				}

				if (sums > 0) {
					// 消去右侧重复的数字
					while (nums[k--] == nums[k] && j < k)
						;
				}

				// 消去和当前左指针相同的数字
//				while (nums[i] == nums[i + 1] && i < nums.length - 2)
//					i++;
				// System.out.println("last i j k :" + i + j + k);
			}

		}
		return result;
	}

	public static List<List<Integer>> threeSum(int[] num) {
		Arrays.sort(num);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1, k = num.length - 1; j < k;) {
				if (num[i] + num[j] + num[k] == 0) {
					List<Integer> l = new ArrayList<Integer>();
					l.add(num[i]);
					l.add(num[j]);
					l.add(num[k]);
					if (set.add(l))
						list.add(l);
					j++;
					k--;
				} else if (num[i] + num[j] + num[k] < 0)
					j++;
				else
					k--;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Integer[] test = { -1, 0, 1, 2, 0, -2 };
		Arrays.sort(test);

		int[] t2 = { -1, 0, 1, -1, 2, -2 };

		List<List<Integer>> list = threeSum2(t2);

		for (List<Integer> list2 : list) {
			for (Integer integer : list2) {
				System.out.print(integer + " ");
			}
			System.out.println(" === ");
		}

		// Set<Integer[]> answer = sum2Zero(test);
		// for (Integer[] nums : answer) {
		// for (int i = 0; i < nums.length; i++) {
		// System.out.print(nums[i] + " ");
		// if (i == nums.length - 1) {
		// System.out.println(" ");
		// }
		// }
		// }

	}

}
