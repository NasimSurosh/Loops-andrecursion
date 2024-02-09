package assignment;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, avg;
		System.out.println("Enter three numbers ");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		scan.close();
		avg = (a + b + c) / 3 ;
		
		System.out.println("average of givin numbers are: " + avg);
	}

}
