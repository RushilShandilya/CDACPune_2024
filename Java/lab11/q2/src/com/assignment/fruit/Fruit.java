package com.assignment.fruit;

import java.lang.Comparable;

public class Fruit implements Comparable<Fruit>{
	private String name;
	private String color;
	private double price;
	private int quantity;
	
	public Fruit(){}
	public Fruit(String name,String color, int quantity , double price){
		this.name = name;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public double getPrice(){
		return price;
	}
	public int getQuantity(){
		return quantity;
	}
	@Override
	public String toString(){
		return "Fruit:[ Name:" + getName()
			+" Color:" + getColor()
			+" Quantity:" + getQuantity()
			+" Price:" + getPrice()
			+"]";	
	}
	@Override
	public int compareTo(Fruit fruit){
		return (this.getColor()).compareTo(fruit.getColor());
	}

}
