package com.shapemaker.circle;
import com.shapemaker.drawable.Drawable;

public class Circle implements Drawable{
	public void draw(String message){
		System.out.println("This message from Circle Class : " + message);
	}
}
