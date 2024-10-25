package com.filehandling.main;

import com.filehandling.book.Book;
import com.filehandling.book.BookType;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DataUtil {
    private static final List<Book> listOfBooks = new LinkedList<>();
    public static List<Book> createData(){

        listOfBooks.add(new Book("A", BookType.valueOf("HORROR"),20.0, LocalDate.of(2020,12,1),"XYZ",10));
        listOfBooks.add(new Book("B", BookType.valueOf("SCIFI"),25.0, LocalDate.of(2016,8,1),"ABC",20));
        listOfBooks.add(new Book("C", BookType.valueOf("POLITICS"),15.0, LocalDate.of(2010,4,1),"DEF",5));
        listOfBooks.add(new Book("D", BookType.valueOf("ANTHROPOLOGY"),10.0, LocalDate.of(2005,10,1),"GHI",15));
        listOfBooks.add(new Book("E", BookType.valueOf("HISTORY"),25.0, LocalDate.of(2001,12,10),"JKL",25));

        return listOfBooks;
    }
}
