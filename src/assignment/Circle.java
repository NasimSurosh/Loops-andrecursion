package assignment;

public class Circle {

	public static void main(String[] args) {
		
		Circle1 cir = new Circle1();
		
		double circle = cir.circle(5);
		System.out.println("The area of circle is: " + circle);
		
		double rectingle = cir.rectangle(5, 6);
		System.out.println("The area of rectingle is: " + rectingle);
		
		double tringle = cir.tringle(circle, rectingle);
		System.out.println("The area of tringle is: " + tringle);

	}

}
