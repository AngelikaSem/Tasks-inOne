package lv.accenture.prebc;

import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name;
		int age;
		
		System.out.print("Enter your first name, darling: ");
		Name = sc.next();
		System.out.print("Enter you age: ");
		
		age = sc.nextInt();
		sc.close();
		
		System.out.println("Hello! My name is " + Name + " and I am " + age + " years old. ");
		

	}

}
