public class Circle implements Shape{
	private double radius;
	public Circle(){}
	public Circle(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return 3.14*getRadius()*getRadius();
	}
}

