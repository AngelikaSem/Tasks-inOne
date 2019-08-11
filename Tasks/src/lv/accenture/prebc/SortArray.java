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
