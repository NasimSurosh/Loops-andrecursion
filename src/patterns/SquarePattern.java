package patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number for pattern: ");
		
		int pattern = scan.nextInt();
		scan.close();
		
        
		for (int i = 1 ; i <= pattern; i ++) {
			for (int j = i ; j <= pattern ; j ++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j <= i ; j ++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
