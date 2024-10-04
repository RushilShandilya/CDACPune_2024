public class Main{
	public static void main(String... args){
		Circle circle = new Circle(10);
		System.out.println("The area of circle: "+circle.getArea());

		Rectangle rectangle = new Rectangle(10,15);
		System.out.println("The area of rectangle: "+rectangle.getArea());

		Triangle triangle = new Triangle(10,15);
		System.out.println("The area of Triangle: "+triangle.getArea());
		return ; 
	}
}
