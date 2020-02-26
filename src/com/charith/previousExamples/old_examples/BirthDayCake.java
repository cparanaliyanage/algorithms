package com.charith.previousExamples.old_examples;

import java.util.Arrays;
import java.util.Scanner;

public class BirthDayCake {

	static int birthdayCakeCandles(int n, int[] ar) {
		Arrays.sort(ar);
		int numberOfCandles = 1;
		for (int i = n - 2; i >= 0; i--) {
			if (ar[n - 1] == ar[i]) {
				numberOfCandles++;
			} else {
				break;
			}
		}
		return numberOfCandles;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}
}
