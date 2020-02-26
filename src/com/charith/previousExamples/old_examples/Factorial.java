package com.charith.previousExamples.old_examples;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(calculateFactorial(n));

	}

	private static BigInteger calculateFactorial(int n) {
		if (n == 1) {
			return new BigInteger("1");
		} else {
			return new BigInteger(String.valueOf(n)).multiply(calculateFactorial(n - 1));
		}
	}
}