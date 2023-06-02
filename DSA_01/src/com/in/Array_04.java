package com.in;

import java.util.Arrays;

class Multiple {
	int mul(int arr[]) {
		int mull = 1;
		int num = 0;
		Arrays.sort(arr);
		for (int i = arr.length - 1; i > 0; i--) {
			if (num < 3) {
				mull = arr[i] * mull;
				num++;
			} else if (num == 3)
				break;
		}
		return mull;
	}
}

public class Array_04 {

	public static void main(String[] args) {
		Multiple call = new Multiple();
		int array[] = { 5,4,9,2,1,1,1 };
		int ans = call.mul(array);
		System.out.println(ans);
	}
}
