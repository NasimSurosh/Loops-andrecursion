package assignment;

public class GreatingMessage {
	
	String greet;
	
	void greeting() {
		System.out.println("Hello!");
		System.out.println("My name is Nasim and willcome to our class");
	}

	public static void main(String[] args) {
		
		GreatingMessage mesage = new GreatingMessage();
		
		mesage.greet = "Wellcome to our class";	
		
		System.out.println(mesage.greet);
		
		mesage.greeting();

	}

}
