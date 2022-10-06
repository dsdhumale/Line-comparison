package com.Bridgelabz.Day8;

import java.util.Scanner;

public class ComparisonOfTwoLine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x1 value");
		double x1 = input.nextDouble();

		System.out.println("Enter the x2 value");
		double x2 = input.nextDouble();

		System.out.println("Enter the y1 value");
		double y1 = input.nextDouble();

		System.out.println("Enter the y2 value");
		double y2 = input.nextDouble();

		System.out.println("Enter the x3 value");
		double x3 = input.nextDouble();

		System.out.println("Enter the x4 value");
		double x4 = input.nextDouble();

		System.out.println("Enter the y3 value");
		double y3 = input.nextDouble();

		System.out.println("Enter the y4 value");
		double y4 = input.nextDouble();

		double line1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		System.out.println("Length of line is  " + line1);

		double line2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
		System.out.println("Length of line is  " + line2);

		System.out.println("Check equality of the two lines:");

		if (line1 == line2) {
			System.out.println("Two lines are Equal");
		} else {
			System.out.println("Two lines are not Equal");
		}

		System.out.println("Comparing the two lines:");

		if (line1 > line2) {
			System.out.println("Line1 is maximum");
		} else {
			System.out.println("Line2 is the maximum");
		}

	}
}
