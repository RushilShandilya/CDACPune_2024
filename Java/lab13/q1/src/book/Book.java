package src.book;

import src.book.Genre;
import java.time.LocalDate;

public class Book{
	private String title;
	private Genre genre;
	private double price;
	private LocalDate publishedDate;
	private String authorName;
	private int quantity;
	
	public Book(String title,Genre genre,double price,LocalDate publishedDate,String authorName,int quantity){
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.publishedDate = publishedDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getTitle(){
		return title;
	}
	public Genre getGenre(){
		return genre;
	}
	public double getPrice(){
		return price;
	}
	public LocalDate getPublishedDate(){
		return publishedDate;
	}
	public String getAuthorName(){
		return authorName;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	@Override
	public String toString(){
		return "Book:[Name=" + getTitle()
				+" Genre=" + getGenre().getGenreName()
				+" Price=" + getPrice()
				+" PublishedDate=" + getPublishedDate()
				+" AuthorName=" + getAuthorName()
				+" Quantity=" + getQuantity()
				+" ]";
	}
}
