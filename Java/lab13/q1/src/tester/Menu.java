package src.tester;

import src.book.Genre;
import src.book.Book;
import src.tester.DataUtils;
import src.exceptionhandling.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;

public class Menu{
	private static Map<String,Book> bookList = DataUtils.createDummyData();
	public static void showMenu(){
		System.out.println("Welcome to Library Application");
		System.out.println("1. Add Book");
		System.out.println("2. Display all Book");
		System.out.println("3. Allot Book to Student");
		System.out.println("4. Take Book return");
		System.out.println("5. Delete Book");
	}
	static LocalDate getDate(Scanner sc){
		System.out.println("Enter details for Date");
		
		System.out.println("Year");
		int year = sc.nextInt();
		
		System.out.println("Month");
		int month = sc.nextInt();
		
		System.out.println("DayOfMonth");
		int day = sc.nextInt();
		
		return LocalDate.of(year,month,day);
	}
	static Genre getGenre(Scanner sc){
		System.out.println("Enter the Genre of the Book");
		switch((sc.nextLine()).toUpperCase()){
			case "FICTION": return Genre.FICTION;
			case "SELFHELP": return Genre.SELFHELP;
			case "HISTORY": return Genre.HISTORY;
			case "NONFICTION": return Genre.NONFICTION;
			case "THRILLER": return Genre.THRILLER;
			case "POLITICS": return Genre.POLITICS;
			case "ECONOMICS": return Genre.ECONOMICS;
			case "PHILOSPHY": return Genre.PHILOSPHY;
			case "HUMOR": return Genre.HUMOR;
			default : return null;
		}
	}
	public static void addBook(Scanner sc) throws DuplicateBookFoundException{
		sc.nextLine();
		System.out.println("Enter Book Details Below");
		System.out.println("Name");
		String name = sc.nextLine();
		
		System.out.println("Genre");
		Genre genre = getGenre(sc);
		
		System.out.println("Price");
		double price = sc.nextDouble();
		
		System.out.println("Published Date");
		LocalDate publishedDate = getDate(sc);
		
		System.out.println("Author Name");
		sc.nextLine();
		String authorName = sc.nextLine();
		
		System.out.println("Quantity");
		int quantity = sc.nextInt();
		
		if(bookList.isEmpty() || !(bookList.containsKey(name))) bookList.put(name,new Book(name,genre,price,publishedDate,authorName,quantity));
		else throw new DuplicateBookFoundException("The given book is already in the library");
	}
	public static void printAllBook(){
		for(String bookName : bookList.keySet()){
			System.out.println(bookList.get(bookName));
		}
	}
	public static void allotBook(String bookName) throws BookNotFoundException{
		Book bookDetails = null;
		if(bookList.get(bookName)!=null)bookDetails = bookList.get(bookName);
		else throw new BookNotFoundException("The given book is not found in the database");
		
		int quantity = bookDetails.getQuantity();
		if(quantity==0) throw new BookNotFoundException("The given book is registered but it's quantity is 0");
		--quantity;
		
		bookDetails.setQuantity(quantity);
		bookList.put(bookName,bookDetails);
	}
	public static void returnedBook(String bookName) throws BookNotFoundException{
		Book bookDetails = null;
		if(bookList.get(bookName)!=null)bookDetails = bookList.get(bookName);
		else throw new BookNotFoundException("The given book is not found in the database");
		
		int quantity = bookDetails.getQuantity();
		++quantity;
		
		bookDetails.setQuantity(quantity);
		bookList.put(bookName,bookDetails);
	}
	public static void deleteBook(String bookName) throws BookNotFoundException{
		if(!bookList.containsKey(bookName)) throw new BookNotFoundException("Can't delete Book , it doesn't exist in Library");
		bookList.remove(bookName);
	}
	public static void chooseOption(Scanner sc) throws DuplicateBookFoundException,BookNotFoundException{
		System.out.println("Enter the your choice");
		switch(sc.nextInt()){
			case 1:{
				addBook(sc);
				break;
			}
			case 2:{
				printAllBook();
				break;
			}
			case 3:{
				System.out.println("Enter the book name you want to rent");
				sc.nextLine();
				allotBook(sc.nextLine());
				break;
			}
			case 4:{
				System.out.println("Enter the book name being returned");
				sc.nextLine();
				returnedBook(sc.nextLine());
			}
			case 5:{
				System.out.println("Enter the book name you want to delete");
				sc.nextLine();
				deleteBook(sc.nextLine());
			}
		}
	}

}