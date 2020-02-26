package com.charith.previousExamples.old_examples;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] primaryDiagonal = new int[n];
		int[] secondaryDiagonal = new int[n];
		int i = -1;
		int j = n;
		for (int ar_i = 0; ar_i < n; ar_i++) {
			i++;
			j--;
			for (int ar_j = 0; ar_j < n; ar_j++) {
				int value = in.nextInt();
				if (i == ar_j) {
					primaryDiagonal[ar_i] = value;
				}
				if (j == ar_j) {
					secondaryDiagonal[ar_i] = value;
				}
			}
		}

		int sum = 0;
		for (int k = 0; k < n; k++) {
			sum += primaryDiagonal[k] - secondaryDiagonal[k];
		}
		System.out.println(Math.abs(sum));
	}
}