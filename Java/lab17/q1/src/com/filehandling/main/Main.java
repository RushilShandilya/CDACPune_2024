package com.filehandling.main;

import com.filehandling.book.Book;

import java.util.List;
import static com.filehandling.main.BookUtil.saveBookToFile;
import static com.filehandling.main.BookUtil.writeFromFileToBook;

public class Main {
    private static final List<Book> listOfBooks = DataUtil.createData();
    public static void main (String...args){
        String fileName = "example";
        saveBookToFile(listOfBooks, fileName);
        writeFromFileToBook(listOfBooks.size(),fileName);
    }
}

