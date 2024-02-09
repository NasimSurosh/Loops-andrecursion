package forLoop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please inter a number:  ");
	int factorial = scan.nextInt();
	
	int result = 1;
	for (int i = 1 ; i <= factorial ; i++) {
		result = result * i;
	}
	System.out.println(result);
	scan.close();
	}

}
