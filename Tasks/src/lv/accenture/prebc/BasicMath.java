package lv.accenture.prebc;

import java.util.Scanner;

public class BasicMath {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a whole number  : ");
		int a = sc.nextInt();
		
		System.out.print("Please enter a floating number  : ");
		float b = sc.nextFloat();
		sc.close();	
		
		double sum = a + b;
		double sub = a - b;
		double mul = a * b;
		double div = a / b;
		
		
		System.out.println("SUM of ur numberz: " + sum );
		System.out.println("SUB of ur numberz: " + sub );
		System.out.println("MUL of ur numberz: " + mul);
		System.out.println("DIV of ur numberz: " + div );
		
	}
	

}
