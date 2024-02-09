package methodOverloading;

public class Person1 {
	
	void greet() {
		System.out.println("Hello!");
	}
	
	void greet (String name) {
		System.out.println("Hello " + name);
	}
	
	void greet (String name, int height) {
		System.out.println("Hello!" + name);
		
		if (height > 190) {
			System.out.println("You are tall");
		}
		else {
			System.out.println("You are normal");
		}
		
	
	}

}
