package forLoop;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start number: ");
		
		int start = scan.nextInt();
       
        System.out.println("Enter the end number: ");
        int end = scan.nextInt();
      
        
        System.out.println("the program will run from " + start + " to " + end);
		scan.close();
		for (int i = start; i <= end ; i ++) {
			if (i%2 == 0) {
				System.out.println(i);
				
				
			}
		}
	}

}
