package lv.accenture.prebc;

import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		String name;
		int age;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter you age: ");
		age = sc.nextInt();
		sc.close();

		System.out.println("Hello! My name is " + name + " and I am " + age + " years old. ");
	}
}
