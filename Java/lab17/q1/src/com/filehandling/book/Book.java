package com.filehandling.book;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Book implements Serializable {

    private final String title;
    private final BookType bookType;
    private Double price;
    private LocalDate publishedDate;
    private final String authorName;
    private Integer quantity;

    public Book(String title, BookType bookType, Double price, LocalDate publishedDate, String authorName, Integer quantity) {
        this.title = title;
        this.bookType = bookType;
        this.price = price;
        this.publishedDate = publishedDate;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public BookType getBookType() {
        return bookType;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookType=" +bookType.printBookFullForm()+
                ", price=" + price +
                ", publishedDate=" + publishedDate +
                ", authorName='" + authorName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    private String getFullForm(BookType bookType) {
        switch (bookType){
            case ANTHROPOLOGY:return BookType.ANTHROPOLOGY.printBookFullForm();
            case SCIFI:return BookType.SCIFI.printBookFullForm();
            case SELFHELP:return BookType.SELFHELP.printBookFullForm();
            case HISTORY:return BookType.HISTORY.printBookFullForm();
            case HORROR:return BookType.HORROR.printBookFullForm();
            case POLITICS:return BookType.POLITICS.printBookFullForm();
            default : return "";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && bookType == book.bookType && Objects.equals(price, book.price) && Objects.equals(publishedDate, book.publishedDate) && Objects.equals(authorName, book.authorName) && Objects.equals(quantity, book.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, bookType, price, publishedDate, authorName, quantity);
    }
}
