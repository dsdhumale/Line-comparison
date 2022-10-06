package com.Bridgelabz.Day8;

import java.util.Scanner;

public class CalculationOfLength {
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

		double length = Math.sqrt(((x2 - x1)*(x2 - x1))+ ((y2 - y1)*(y2 - y1)));
		System.out.println("Length of line is  " + length);

	}

}
