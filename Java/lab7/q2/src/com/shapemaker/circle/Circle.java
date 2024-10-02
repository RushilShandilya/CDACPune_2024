package com.shapemaker.circle;
import com.shapemaker.shape.Shape;

public class Circle extends Shape{
	private double radius;
	public Circle(){}

	public Circle(double radius){
		this.radius = radius;
	}

	@Override
	public double calculateArea(){
		return 3.14*radius*radius;
	}
	@Override
	public double calculatePerimeter(){
		return 2*3.14*radius;
	}
	public void draw(){
		System.out.println("Drawing circle");
	}
}
