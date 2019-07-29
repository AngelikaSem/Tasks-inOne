package lv.accenture.prebc;

import java.util.Scanner;

public class HelloUser {
	
	public static void main (String[] args) {
		System.out.println("What is your full name?");
		
		Scanner scanner = new Scanner(System.in);
		String fullname = scanner.nextLine();
		scanner.close();
		
		
		
		System.out.println("'"+fullname.substring(0, 8)+" " + fullname.substring(9, 20).toUpperCase()+ "'");
	
				
		
	}

}
