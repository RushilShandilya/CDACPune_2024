package com.filehandling.main;

import com.filehandling.book.Book;
import com.filehandling.book.BookType;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class BookUtil {
    public static void saveBookToFile(List<Book> bookList, String file){
            try(
                    FileOutputStream fos = new FileOutputStream(file);
                    DataOutputStream dataOutputStream = new DataOutputStream(fos);
            ){
                for(Book book : bookList){
                    dataOutputStream.writeUTF(book.getTitle());
                    dataOutputStream.writeUTF(book.getBookType().printBookFullForm().toUpperCase());
                    dataOutputStream.writeDouble(book.getPrice());
                    dataOutputStream.writeUTF(book.getPublishedDate().toString());
                    dataOutputStream.writeUTF(book.getAuthorName());
                    dataOutputStream.writeInt(book.getQuantity());
                }
            }catch(IOException e){
                System.out.println("The error message is :" + e.getMessage());
            }
    }
    public static void writeFromFileToBook(int sizeOfBookList,String file){

        try(FileInputStream fis = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fis)
        ){
            for(int i = 0 ; i<sizeOfBookList ; ++i){
                System.out.println(new Book(
                        dataInputStream.readUTF(),
                        BookType.valueOf(dataInputStream.readUTF()),
                        dataInputStream.readDouble(),
                        LocalDate.parse(dataInputStream.readUTF()),
                        dataInputStream.readUTF(),
                        dataInputStream.readInt()
                ));
            }
        }catch (IOException e){
            System.out.println("The error message is :" + e.getMessage());
        }
    }
}
