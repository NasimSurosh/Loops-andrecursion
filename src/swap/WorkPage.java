package swap;

import java.util.Scanner;

public class WorkPage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the first number : ");
		int a = scan.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = scan.nextInt();
		scan.close();
	
		
		swap(a, b);
		System.out.println("after swaping value: a = "+ a + " b = "+ b);
		

	}
	static void swap (int a, int b) {
		int temporary = a ;
		a = b;
		b = temporary;
		System.out.println("inside swap method: a = " + b + " , b = " + b);
	}

}
