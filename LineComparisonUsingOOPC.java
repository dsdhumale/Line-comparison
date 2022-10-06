package com.Bridgelabz.Day8;

import java.util.Scanner;

public class LineComparisonUsingOOPC {
	public static double line1;
	public static double line2;
	
	public static void CalOfLength()
	{
		double x1 = 13, x2 = 20, y1 = 2, y2 = 6;
		double x3 = 13, x4 = 25, y3 = 2, y4 = 6;

		line1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		System.out.println("Length of line is  " + line1);

		line2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
		System.out.println("Length of line is  " + line2);
		
	}
	public static void CheckEquality()
	{
		System.out.println("Comparing the two lines:");
		System.out.println(line1 == line2);
	}
	public static void Comparison()
	{
		if (line1 > line2) {
			System.out.println("Line1 is maximum");
		} else if(line1 < line2) {
			System.out.println("Line2 is the maximum");
		}

	}
	public static void main(String[] args) {
		CalOfLength();
		CheckEquality();
		Comparison();
	}
	
}
