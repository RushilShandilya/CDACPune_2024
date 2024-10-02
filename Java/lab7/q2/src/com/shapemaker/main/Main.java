package com.shapemaker.main;

import java.util.Scanner;
import com.shapemaker.shape.Shape;
import com.shapemaker.circle.Circle;
import com.shapemaker.rectangle.Rectangle;

public class Main{
	public static void openMenu(){
		System.out.println("Choose below options");
		System.out.println("1.Make circle");
		System.out.println("2.Make rectangle");
	}
	public static double getRadius(Scanner sc){
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		return radius;
	}
	public static double getLength(Scanner sc){
		System.out.println("Enter length");
		return sc.nextDouble();
	}
	public static double getBreadth(Scanner sc){
		System.out.println("Enter breadth");
		return sc.nextDouble();
	}
	public static void chooseOption(int enterOption,Scanner sc){
		switch(enterOption){
			case 1:{
				Shape shape = new Circle(getRadius(sc));
				Circle circle2 =(Circle)shape;
				circle2.draw();
				break;
			}
			case 2:{
				Rectangle rectangle = new Rectangle(getLength(sc),getBreadth(sc));
				break;
			}
		}
	}
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		char toContinue;
		do{	
			openMenu();
			chooseOption(sc.nextInt(),sc);
			System.out.println("Do you want to to continue?(y or n)");
			toContinue = sc.next().charAt(0);
		}while(toContinue=='y' || toContinue=='Y');
		return ;
	}
}
