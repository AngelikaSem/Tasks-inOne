package lv.accenture.prebc;

public class AllTasksInOne {
	import java.util.Scanner;

	public class BasicMath {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Please enter a whole number  : ");
			int a = sc.nextInt();

			System.out.print("Please enter a floating number  : ");
			float b = sc.nextFloat();
			sc.close();

			float sum = a + b;
			float sub = a - b;
			float mul = a * b;
			float div = a / b;

			System.out.println("SUM of " + a + " and " + b + " is " + sum);
			System.out.println("SUB of " + a + " and " + b + " is " + sub);
			System.out.println("MUL of " + a + " and " + b + " is " + mul);
			System.out.println("DIV of " + a + " and " + b + " is " + div);
			System.out.println("SQUARE OF " + sum + " is " + (sum * sum));
		}
	}

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

	package lv.accenture.prebc;

	public class Greetings {

		public static void main(String[] args) {
			String myname = "Albus Dumbledore";
			int age = 66;

			System.out.println("Hello! My name is " + myname + " and I am " + age + " years old.");
		}
	}
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

	package lv.accenture.prebc;

	import java.util.Random;
	import java.util.Scanner;

	public class GuessNumber {

		public static void main(String[] args) {

			Scanner scr = new Scanner(System.in);
			int yournumber;

			Random rnd = new Random();
			int mynumber = rnd.nextInt(11);
			boolean correct = false;

			System.out.println("Guess a number from 1 to 10! ");

			while (!correct) {

				yournumber = scr.nextInt();

				if (mynumber == yournumber) {
					correct = true;
					System.out.println("Yeah! You guessed correctly!");
				} else if (mynumber > yournumber) {
					System.out.println("Try a higher number!");
				} else if (mynumber < yournumber) {
					System.out.println("Try a lower nummber!");
				}
			}
			scr.close();
		}
	}

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
	package lv.accenture.prebc;

	import java.util.Random;
	import java.util.Scanner;

	public class SortArray {

		public static void main(String[] args) {

			System.out.println("Enter a whole number from 20 to 40!");

			Scanner scr = new Scanner(System.in);
			int usernumber = scr.nextInt();
			scr.close();

			int[] arr = new int[usernumber];
			Random rnd = new Random();

			for (int i = 0; i < usernumber; i++) {

				arr[i] = rnd.nextInt(99);
				System.out.println("This is it : " + arr[i]);
			}
		}

}
