package lv.accenture.prebc;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int yournumber;
	
		
		Random rnd = new Random ();
		int mynumber = rnd.nextInt(11);
		boolean correct = false;
		
		System.out.println("Guess a number from 1 to 10! ");
		
		while(!correct){
	
			yournumber = scr.nextInt();
		
			if (mynumber == yournumber) {
				correct = true;
				System.out.println("Yeah! You guessed correctly!");
			}
			else if (mynumber>yournumber) {
				System.out.println("Try a higher number!");
			}
			else if (mynumber<yournumber) {
				System.out.println("Try a lower nummber!");
				scr.close();
			}
			
			
	}				
	}			
}
