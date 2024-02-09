package example.Package;

public class passingByValue {
	static void changeName(SubPass subPass) {
		subPass.name = "kalim";
		subPass.age= 34;
	}

	public static void main(String[] args) {
	
		SubPass val = new SubPass("Olga", 43);
		SubPass val1 = new SubPass("akhg", 87);
		val.dispaly();
		System.out.println();
		val1.dispaly();
		
		System.out.println();
		changeName(val);
		val.dispaly();
		
		
	}

}
