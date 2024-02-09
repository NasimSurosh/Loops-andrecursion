package recursion;

import java.util.Scanner;

public class recursionMain {

	public static void main(String[] args) {
	
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
	
		
		positiveInteger(a);

		}
		public static void positiveInteger (int a) {
		     System.out.println(a);
		     if (a == 0) {
			 return ;
				
		} 
				positiveInteger(a - 1);
				
			


	}

}
