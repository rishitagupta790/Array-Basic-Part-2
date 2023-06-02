package com.in;

class MinScoreClass {
	public int minimumScore(int[] nums, int k) {
		int minScore = Integer.MAX_VALUE;

		for (int x = -k; x <= k; x++) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;

			for (int i = 0; i < nums.length; i++) {
				int newValue = nums[i] + x;
				min = Math.min(min, newValue);
				max = Math.max(max, newValue);
			}

			int score = max - min;
			minScore = Math.min(minScore, score);
		}

		return minScore;
	}
}

public class Array_07 {

	public static void main(String[] args) {
		MinScoreClass msc = new MinScoreClass();
		int[] nums = { 1, 2, 3 };
		int k = 1;
		System.out.println(msc.minimumScore(nums, k));
	}
}
