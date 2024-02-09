package methodParametrs;

public class app {

	public static void main(String[] args) {
		
		AppCalculator calculate = new AppCalculator();
		int square = calculate.square(9);
		System.out.println(square);
		
		int add = calculate.add(6, 7);
		System.out.println("6 + 7 = " + add);

	}

}
