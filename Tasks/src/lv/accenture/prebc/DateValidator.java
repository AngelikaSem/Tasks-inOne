package lv.accenture.prebc;

import java.time.Month;
import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a date : ");
		int date = scanner.nextInt();

		System.out.println("Enter a month: ");
		int b = scanner.nextInt();

		System.out.println("Enter a year : ");
		int year = scanner.nextInt();
		scanner.close();
		Month month = Month.of(b);

		if ((b == 4) && (date > 30)) {
			System.out.println("Not possible, try again!");
		} else if ((b == 6) && (date > 30)) {
			System.out.println("Not possible, try again!");
		} else if ((b == 9) && (date > 30)) {
			System.out.println("Not possible, try again!");
		} else if ((b == 11) && (date > 30)) {
			System.out.println("Not possible, try again!");
		} else if (b == 2 && date <= 28) {
			System.out.println("'" + date + ". " + month + "," + year + "' ");
		} else if ((b == 2 && date == 29) && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("'" + date + ". " + month + "," + year + "' " + "a leap year!");

		} else {
			System.out.println("Not possible, try again!");

		}
	}
}
