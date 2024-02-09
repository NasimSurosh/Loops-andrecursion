package example.Package;

import java.util.Scanner;

public class Do {

	public static void main(String[] args) {
		
		String userPass = "12345";
		Scanner scan = new Scanner(System.in);
		String pwd = null;
		
		do {
			System.out.println("Please enter password.");
			pwd = scan.nextLine();
			
		}while(!userPass.equalsIgnoreCase(pwd));
		System.out.println("pwd granted");
scan.close();
	}

}
