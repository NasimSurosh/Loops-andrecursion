package firstMethod;

public class app {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		ReturnValue value = new ReturnValue();
		
		person1.name = "Alex";
		person1.age = 35;
		person2.name = "Yalda";
		person2.age = 34;
		String animal = value.getAnimals();
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(animal);
		
		person2.sayHello();
		

	}

}
