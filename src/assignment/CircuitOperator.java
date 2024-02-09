package assignment;

import java.util.Scanner;

public class CircuitOperator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int number = scan.nextInt();
		scan.close();
		String range = (number >= 10) && (number <= 50) ? "inclodes the valid range": "Dose not include the range";
		System.out.println("The result is: " + range);
	}

}
