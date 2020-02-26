package com.charith.previousExamples.old_examples;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		Arrays.sort(arr);
		Long minSum = 0L;
		for (int arr_i = 1; arr_i < 4; arr_i++) {
			minSum += arr[arr_i];
		}
		System.out.println((minSum + arr[0]) + " " + (minSum + arr[4]));
	}
}
