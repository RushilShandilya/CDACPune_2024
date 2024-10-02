package com.fruitshop.fruit;

public class Fruit{
	private String name;
	private String color;
	private double price;
	private int quantity;
	
	public Fruit(){}
	public Fruit(String name,String color, double price, int quantity){
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
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
			+" Price:" + getPrice()
			+" Quantity:" + getQuantity()
			+"]";	
	}

}
