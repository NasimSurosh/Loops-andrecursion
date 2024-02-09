package example.Package;

import java.util.Scanner;

public class fahrenheit {

	public static void main(String[] args) {

		System.out.println("enter start number");

		Scanner scan = new Scanner(System.in);

		int start = scan.nextInt();

		System.out.println("enter end number");
		int end = scan.nextInt();
		System.out.println("it will run from "+ start + " to " + end);
		for (int i = start; i <= end; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			scan.close();
		}
	}

}
