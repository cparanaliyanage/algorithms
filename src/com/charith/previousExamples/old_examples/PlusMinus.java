package com.charith.previousExamples.old_examples;

import java.math.BigDecimal;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		int[] propotion = calculatePlusMinus(array);
		Double positivePotion = new BigDecimal((double)propotion[0] / n).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
		Double negativePotion = new BigDecimal((double)propotion[1] / n).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
		Double zeroPotion = new BigDecimal((double)propotion[2] / n).setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(positivePotion);
		System.out.println(negativePotion);
		System.out.println(zeroPotion);
	}

	private static int[] calculatePlusMinus(int[] array) {
		int[] summation = {0, 0, 0};
		for (int anArray : array) {
			if (anArray > 0) {
				summation[0] += 1;
			} else if (anArray < 0) {
				summation[1] += 1;
			} else {
				summation[2] += 1;
			}
		}
		return summation;
	}
}