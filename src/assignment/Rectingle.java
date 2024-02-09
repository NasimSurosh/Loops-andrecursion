package assignment;

import java.util.Scanner;

public class Rectingle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of rectingle: ");
		float height = scan.nextFloat();
		System.out.println("Enter the weidth of rectingle: ");
		float weidth = scan.nextFloat();
		float area = height * weidth;
		float perimeter = 2 * (weidth + height);
		System.out.println("The area of rectingle as: " + area);
		System.out.println("The perimeter of rectingle is: " + perimeter);
		scan.close();

	}

}
