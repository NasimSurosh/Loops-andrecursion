package assignment;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a mark ");
		int StudentMarks = scan.nextInt();
		
	
		
			
			if(StudentMarks >= 90 && StudentMarks == 100) {
				System.out.println("A");
			}
			else if (StudentMarks >= 80 && StudentMarks <= 89){
				System.out.println("B");
			}
			else if(StudentMarks >= 70 && StudentMarks <= 79) {	
				System.out.println("C");
			}
			else if(StudentMarks >= 60 && StudentMarks <= 69) {
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		
				
		scan.close();
		

	}

}
