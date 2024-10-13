package com.grocer.Grocery;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Item{
    private String name;
    private Double pricePerUnit;
    private Integer quantity;
    private LocalDateTime initialDateTime;
    private List<LocalDateTime> trackQuantityChange;

    public Item(String name, Double pricePerUnit ,Integer quantity, LocalDateTime initialDateTime) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
        this.initialDateTime = initialDateTime;
        trackQuantityChange = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public List<LocalDateTime> getTrackQuantityChange() {
        return trackQuantityChange;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", quantity=" + quantity +
                ", initialDateTime=" + initialDateTime +
                ", trackQuantityChange=" + trackQuantityChange +
                '}';
    }
}
