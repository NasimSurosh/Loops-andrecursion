package assignment;

public class Addition {

	public static void main(String[] args) {
		
		Addition1 calculate = new Addition1();
		
		int addition = calculate.addition(5, 7);
		System.out.println(" 5 + 7 = " + addition);
		
		int subtraction = calculate.subtraction(8, 7);
		System.out.println(" 8 - 7 = " + subtraction);
		
		int multiplication = calculate.mulitiplication(15, 3);
		System.out.println(" 15 * 3 = " + multiplication);
		
		int division = calculate.division(15, 5);
		System.out.println(" 15 / 5 = " + division);
		
		
		

	}

}
