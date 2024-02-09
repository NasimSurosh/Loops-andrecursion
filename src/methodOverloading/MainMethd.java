package methodOverloading;

public class MainMethd {

	public static void main(String[] args) {
		
		Person1 person = new Person1();
		person.greet();
		person.greet("Nasim");
		person.greet("boob", 185);
		person.greet("Kamil", 196);

	}

}
