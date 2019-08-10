package lv.accenture.prebc;

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
