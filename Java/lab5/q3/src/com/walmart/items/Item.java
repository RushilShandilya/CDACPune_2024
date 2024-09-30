package com.walmart.items;

public class item{
	private int itemCode;
	private String itemName;
	private double price;
	private int quantity;

	private static int itemCodeGenerator = 100;

	item(){}
	item(String itemName , double price , int quantity){
		this.itemCode = itemCodeGenerator++;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public int getItemCode(){
		return this.itemCode;
	}
	public String getItemName(){
		return this.itemName;
	}
	public double getPrice(){
		return this.price;	
	}
	public double quantity(){
		return this.quantity;
	}

	@Override
	public String toString(){
		return "Item:[ItemCode = " + this.getItemCode()
			+"ItemName = " + this.getItemName()
			+"ItemPrice = " + this.getPrice()
			+"Quantity = " + this.quantity() + "]";
	}
	
}
