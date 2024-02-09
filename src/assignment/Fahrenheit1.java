package assignment;

import java.util.Scanner;

public class Fahrenheit1 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float fahrenheit;
		double celsius;
		System.out.println("Enter the temerature in fahrenheit : ");
		fahrenheit = scan.nextFloat();
		celsius = (fahrenheit - 32) * 5/9;
		System.out.println("Fahrenheit is : " + fahrenheit);
		System.out.println("celsius is : " + celsius);
		
		scan.close();
	}
}
