package weather;

import java.util.Scanner;

public class weatherFahrenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("chose (1) to fahrenheit to celsios, or chose (2) celsios to fahrenheit: ");
		
		int weather = scan.nextInt();
		
		if (weather == 1) {
			System.out.println("Enter the fahrenheit value: ");
			double fahrenheit = scan.nextDouble();
			double celsios = (fahrenheit -32) * 5 / 9 ;
			System.out.println("the weather forcost is : " + celsios + " celsios");
		}
		if (weather == 2) {
			System.out.println("Enter the celsios value : ");
			double celsios = scan.nextDouble();
			double fahrenheit = (celsios * 9 / 5 ) + 32;
			System.out.println("the weather forcost is : " + fahrenheit + " fahrenheit");
		}
		scan.close();
	}
}
