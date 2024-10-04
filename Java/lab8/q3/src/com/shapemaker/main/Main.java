package com.shapemaker.main;

import com.shapemaker.drawable.Drawable;
import com.shapemaker.circle.Circle;
import com.shapemaker.rectangle.Rectangle;

public class Main{
	public static void main(String... args){
		Circle circle = new Circle();
		circle.draw("Calling from Circle");

		Rectangle rectangle = new Rectangle();
		rectangle.draw("Calling from Rectangle");
		return ;
	}
}
