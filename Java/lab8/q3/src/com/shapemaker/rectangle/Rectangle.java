package com.shapemaker.rectangle;
import com.shapemaker.drawable.Drawable;

public class Rectangle implements Drawable{
	public void draw(String message){
		System.out.println("This message is from  Rectangle class : " + message);
	}
}
