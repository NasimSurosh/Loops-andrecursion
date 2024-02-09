package DoLoop;

import java.util.Scanner;

public class doLoop {

	public static void main(String[] args) {
		

		String userPassword = "nasim";
		Scanner scan = new Scanner(System.in);
		String password = null;
		
		do {
			System.out.println("Please enter your password: ");
			password = scan.nextLine();
		}while(!password.equals(userPassword));
		
		scan.close();
		System.out.println("Password granted");

	}

}
