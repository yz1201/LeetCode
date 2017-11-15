package com.yz.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Median {
	/**
	 * 两个有序数组，求中位数。 思路一，整合两个数组到一个数组中，对数组排序，再求中位数。
	 * 
	 * @param nums
	 * @param nums2
	 * @return
	 */
	public static double getMedian(int[] nums, int[] nums2) {

		// eg: 1-5 1-7

		int len1 = nums.length;
		int len2 = nums2.length;
		int len = len1 + len2;

		int[] numbers = new int[len];

		for (int i = 0; i < len1; i++) {
			numbers[i] = nums[i];
		}

		System.arraycopy(nums2, 0, numbers, len1, len2);

		Arrays.sort(numbers);

		// 小到大。

		for (int i = 0; i < len; i++) {
			System.out.println("numbers" + i + " : " + numbers[i]);
		}

		if (len % 2 == 0) {
			double num1 = numbers[len / 2 - 1];
			double num2 = numbers[len / 2];
			return (num1 + num2) / 2;
		}

		return numbers[(len + 1) / 2 - 1];
	}

	// find 第K小数，
	public static double findMedianSortedArrays(int A[], int B[]) {
		int m = A.length;
		int n = B.length;
		int total = m + n;
		if (total % 2 != 0)
			return (double) findKth(A, 0, m - 1, B, 0, n - 1, total / 2 + 1);// k传得是第k个，index实则k-1
		else {
			double x = findKth(A, 0, m - 1, B, 0, n - 1, total / 2);// k传得是第k个，index实则k-1
			double y = findKth(A, 0, m - 1, B, 0, n - 1, total / 2 + 1);// k传得是第k个，index实则k-1
			return (double) (x + y) / 2;
		}
	}

	public static int findKth(int[] A, int astart, int aend, int[] B, int bstart, int bend, int k) {
		int m = aend - astart + 1;
		int n = bend - bstart + 1;

		if (m > n)
			return findKth(B, bstart, bend, A, astart, aend, k);
		if (m == 0)
			return B[k - 1];
		if (k == 1)
			return Math.min(A[astart], B[bstart]);

		int partA = Math.min(k / 2, m);
		int partB = k - partA;
		if (A[astart + partA - 1] < B[bstart + partB - 1])
			return findKth(A, astart + partA, aend, B, bstart, bend, k - partA);
		else if (A[astart + partA - 1] > B[bstart + partB - 1])
			return findKth(A, astart, aend, B, bstart + partB, bend, k - partB);
		else
			return A[astart + partA - 1];
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int[] nums2 = { 4, 5, 6 };
		System.out.println(Median.findMedianSortedArrays(nums, nums2));
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "2");
		map.put(1, "2");
		map.put(1, "2");
		map.put(1, "2");
		System.out.println(map.size());
	}

}
