package ConnectorGetterAndSetter;

public class MainGetAndSetter {

	public static void main(String[] args) {
		
		GetterAndSetter getSet = new GetterAndSetter();
		
		getSet.setAge(34);
		getSet.setName("yalda");
		System.out.println(getSet.getName() + " , " + getSet.getAge());
	}

}
