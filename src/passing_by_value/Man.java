package passing_by_value;

public class Man {

	String name;
	int age;
	
	Man (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	void display () {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
