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
		
		
		System.out.println("'" + date + ". " + month + "," + year + " ' " );

	}

}
