package com.printers.Printer;

import java.io.Serializable;
import java.time.LocalDate;

public class Printer implements Serializable {
    private Integer serialNumber;
    private String modelNumber;
    private Double price;
    private PrinterType printerType;
    private LocalDate manufacturingDate;

    public Printer(String modelNumber, Double price, PrinterType printerType, LocalDate manufacturingDate) {
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.price = price;
        this.printerType = printerType;
        this.manufacturingDate = manufacturingDate;
    }
}
