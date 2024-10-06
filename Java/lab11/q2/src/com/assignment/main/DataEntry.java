package com.assignment.main;

import com.assignment.fruit.Fruit;
import java.util.List;
import java.util.ArrayList;

public class DataEntry{
	public static List<Fruit> createData(){
		List<Fruit> fruitList = new ArrayList<>();
		
		fruitList.add(new Fruit("Mango","Yellow",5, 100));
		fruitList.add(new Fruit("Guava","Green",10,100));
		fruitList.add(new Fruit("Apple","Red",8,400));
		
		return fruitList;
	}
}
