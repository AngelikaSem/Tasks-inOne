package lv.accenture.prebc;

import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		System.out.println("What is your full name?");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		String[] fullname = name.split(" ");
		String firstname = fullname[0];
		String lastname = fullname[1];

		System.out.println(" ' " + firstname.substring(0, 1).toUpperCase() + firstname.substring(1).toLowerCase() + " "
				+ lastname.toUpperCase() + " ' ");
	}
}
