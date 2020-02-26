package com.charith.previousExamples.old_examples;

import java.util.Scanner;

public class Clock {

	private static String timeConversion(String s) {
		String meridiem = s.substring(s.length() - 2, s.length());
		String hour = s.substring(0, 2);
		if ("AM".equals(meridiem)) {
			if ("12".equals(hour)) {
				hour = "00";
			}
		} else {
			if (!"12".equals(hour)) {
				hour = String.valueOf(Integer.valueOf(hour) + 12);
			}
		}
		return hour + s.substring(2, 8);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = timeConversion(s);
		System.out.println(result);
	}
}
