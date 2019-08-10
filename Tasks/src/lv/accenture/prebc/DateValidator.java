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
		
		
		if ((b == 4) && (date> 30)) {
			System.out.println("Not really possible, try again!");
		}else if ((b == 6) && (date> 30)) {
			System.out.println("Not really possible, try again!");
		}else if ((b == 9) && (date> 30)) {
			System.out.println("Not really possible, try again!");	
		}else if ((b == 11) && (date> 30)) {
			System.out.println("Not really possible, try again!");
		}else if ((b == 2) && (date> 28)) {
			System.out.println("Not really possible, try again!");
		}	else{
			System.out.println("This could work!");
		}	
		
		
		Month month = Month.of(b);  
		
		System.out.println("'" + date + ". " + month + "," + year + " ' " );

	}

}
