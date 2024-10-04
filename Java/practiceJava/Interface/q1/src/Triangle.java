public class Triangle implements Shape{
	private double length;
	private double breadth;
	
	public Triangle(){}
	public Triangle(double length , double breadth){
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
		return 0.5 * length * breadth;
	}
}
