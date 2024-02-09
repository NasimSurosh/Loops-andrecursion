package recursion;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		scan.close();
		
		System.out.println("printing from " + value + " : " );
		
		positiveNumber(value);
		
		System.out.println("printing is complete");
		
	}
	public static void positiveNumber(int value) {
		
		if (value > 0) {
			System.out.println(value);
			positiveNumber(value - 1);
			
		}
	}

}
