package shortCircuitOperatoe;

import java.util.Scanner;

public class CalculateDiscount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Plase enter your order price : ");
		double order = scan.nextDouble();
	
		
		double discount = (order >= 100) ? (0.10 * order) : 0; 
		double totalPrice = order - discount;
		System.out.println(totalPrice);
		System.out.println(discount);
		scan.close();
	}

}
