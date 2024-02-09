package passing_by_value;

public class PassByReference {
	
	static void changeName (Man man) {
		man.name = "NewName";
		man.age = 34;
		
	}
	
	public static void main(String[] args) {
		
		Man refrence = new Man("Olga", 32);
		System.out.println();
		refrence.display();
		
		
		changeName(refrence);
		System.out.println();
		refrence.display();
		
	}
	

}
