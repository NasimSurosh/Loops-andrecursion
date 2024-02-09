package recursion;

import java.util.Scanner;

public class recursion1 {

	public static void main(String[] args) {
		

		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		scan.close();
		
		System.out.println("printing from 1 to " + value);
		
		positiveNumber(value);
		
		System.out.println("printing is complete");
		
	}
	public static void positiveNumber(int value) {
		
		if (value == 0) {
			System.out.println(value);
			return ;
			
		}
		positiveNumber(value - 1);
		System.out.println(value);
		
	}
}
