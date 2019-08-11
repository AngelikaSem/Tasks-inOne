package lv.accenture.prebc;

import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter a whole number: ");
		int a = scr.nextInt();
		System.out.println("Enter another whole number: ");
		int b = scr.nextInt();
		scr.close();

		if (a > b) {
			System.out.println(a + " is greater than " + b);
		} else if (a < b) {
			System.out.println(a + " is greater than " + b);
		} else {
			System.out.println(a + " and " + b + " are equal");
		}
	}
}
