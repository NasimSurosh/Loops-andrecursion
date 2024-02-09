package assignment;

import java.util.Scanner;

public class TemConverter1 {

	public void convertToFehrenheit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the the temperature in celsius: ");
		double celsius = scan.nextDouble();
		double fahrenheit = (celsius*9/5) + 32;
		System.out.println("Temperature fahrenheit: " + fahrenheit);
		scan.close();
	}
	
}
