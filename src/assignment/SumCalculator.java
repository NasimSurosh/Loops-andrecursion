package assignment;

public class SumCalculator {

	public static void main(String[] args) {
		welcome();
		calculateSum (10, 20);
		calculateSum (4, 7);
		calculateSum (12, 13);
		
		
	}
		public static void calculateSum(int a, int b ) {
			System.out.println(a + b);
		

	}
		public static void welcome() {
			System.out.println("wilcome to our calculator ");
		}

}
