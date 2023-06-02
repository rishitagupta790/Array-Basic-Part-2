package com.in;

import java.util.HashSet;

class Solution {
	public int distributeCandies(int[] candyType) {
		int maxTypes = candyType.length / 2;
		HashSet<Integer> uniqueTypes = new HashSet<>();

		for (int candy : candyType) {
			uniqueTypes.add(candy);
			if (uniqueTypes.size() == maxTypes) {
				break;
			}
		}

		return uniqueTypes.size();
	}
}

public class Array_01 {

	public static void main(String[] args) {
		Solution solution = new Solution();

		int[] candyType = { 1, 1, 2, 2, 3, 3 };
		System.out.println(solution.distributeCandies(candyType));

		int[] candyType2 = { 1, 1, 2, 3 };
		System.out.println(solution.distributeCandies(candyType2));

	}

}
