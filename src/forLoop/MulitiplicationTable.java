package forLoop;

import java.util.Scanner;

public class MulitiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start number: ");
		
		int number = scan.nextInt();
		System.out.println("Multiplication table of " + number);
          
		
		
		for (int i = 1; i <= 10 ; i ++) {
				System.out.println(i+ " x " + number + " = " + i * number);
				
				
			}
         scan.close();
	}

}
