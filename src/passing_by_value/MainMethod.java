package passing_by_value;

public class MainMethod {

	public static void main(String[] args) {
		
		MainMethod app = new MainMethod();
		
		int value = 8;
		System.out.println("1. value is: " + value);
		
		app.display(value);
		System.out.println("4. value is: " + value);
	}

	public void display(int value ) {
		System.out.println("2. value is: " + value);
		
		value = 9;
		System.out.println("3. value is: " + value);
	}
}
