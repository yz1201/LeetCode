package com.yz.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.yz.tool.ArraysTool;

public class Sum2Zero {

	
	/**
	 *  failed!@dbdj1201
	 * @param nums
	 * @return
	 */
	public static Set<Integer[]> sum2Zero(Integer[] nums) {
		if (nums.length < 3) {
			return null;
		}

		Set<Integer[]> answer = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				for (int k = 0; k < nums.length; k++) {
					Integer[] ans = new Integer[3];
					if (sum320(nums[i], nums[j], nums[k])) {
						if (nums[i] != nums[j]) {
							ans[0] = nums[i];
							ans[1] = nums[j];
							ans[2] = nums[k];

							if (answer.size() <= 1) {
								answer.add(ans);
								System.out.println(" == == == ");
								ArraysTool.intArrays(ans);
							} else if (answer.size() > 1) {
								for (Integer[] temp : answer) {
									if (!ArraysTool.arraysCompare(ans, temp))
										answer.add(ans);
								}
							}

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

	public static void main(String[] args) {
		Integer[] test = { -1, 0, 1, 2, 0, -2 };
		Arrays.sort(test);

		Set<Integer[]> answer = sum2Zero(test);

//		for (Integer[] nums : answer) {
//			for (int i = 0; i < nums.length; i++) {
//				System.out.print(nums[i] + " ");
//				if (i == nums.length - 1) {
//					System.out.println(" ");
//				}
//			}
//		}

	}

}
