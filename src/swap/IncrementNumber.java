package swap;

import java.util.Scanner;

public class IncrementNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int increase = scan.nextInt();
		scan.close();
		
		increaseNumber(increase);

		
	}
	static void increaseNumber (int a ) {
		a ++;
		System.out.println(a);
	}

}
