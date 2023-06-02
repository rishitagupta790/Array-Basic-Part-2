package com.in;

class Monotonic {
	public boolean isMonotonic(int[] nums) {
		boolean isIncreasing = true;
		boolean isDecreasing = true;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				isDecreasing = false;
			} else if (nums[i] < nums[i - 1]) {
				isIncreasing = false;
			}
		}

		return isIncreasing || isDecreasing;
	}
}

public class Array_06 {

	public static void main(String[] args) {
		Monotonic mono = new Monotonic();
		int[] nums1 = { 1, 2, 3, 4, 5 };
		System.out.println(mono.isMonotonic(nums1));

		int[] nums2 = { 5, 4, 3, 2, 1 };
		System.out.println(mono.isMonotonic(nums2));
	}
}
