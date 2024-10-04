public class Rectangle implements Shape{
	private double length;
	private double breadth;
	
	public Rectangle(){}
	public Rectangle(double length , double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength(){
		return length;
	}
	public double getBreadth(){
		return breadth;
	}
	public double getArea(){
		return getLength()*getBreadth();
	}	
}
