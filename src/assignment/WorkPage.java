package assignment;

import java.util.Scanner;

public class WorkPage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value: ");
		
		int factorial = scan.nextInt();
		scan.close();
		
		
		int result = 1;
		for (int i = 1; i <= factorial; i ++) {
			result = result * i ;
			System.out.println("The factorial of "+ i +" , " +result);
		}

	}

}
