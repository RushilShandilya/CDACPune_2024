package com.grocer.Main;

import com.grocer.Grocery.Item;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class DataUtils {
    private static List<Item> listOfItems = new LinkedList<>();
    public static List<Item> createData(){
        listOfItems.add(new Item("Maggi",10.0,10, LocalDateTime.of(2020,10,10,0,0)));
        listOfItems.add(new Item("Parle-G",20.0,10, LocalDateTime.of(2020,10,10,0,0)));
        listOfItems.add(new Item("Cadbury",15.0,10, LocalDateTime.of(2013,10,10,0,0)));
        listOfItems.add(new Item("Kurkure",5.0,10, LocalDateTime.of(2015,10,10,0,0)));
        listOfItems.add(new Item("Uncle Chips",5.0,10, LocalDateTime.of(2012,10,10,0,0)));
        listOfItems.add(new Item("Pringles",30.0,10, LocalDateTime.of(2018,10,10,0,0)));

        return listOfItems;
    }
}
