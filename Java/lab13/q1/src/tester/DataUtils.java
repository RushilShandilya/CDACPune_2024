package src.tester;

import src.book.Genre;
import src.book.Book;

import java.time.LocalDate;
import java.util.Map;
import java.util.HashMap;

public class DataUtils{
	private static Map<String,Book> bookList = new HashMap<>();
	
	public static Map<String,Book> createDummyData(){
	
		bookList.put("Goblet Of Fire", new Book("Goblet of Fire",Genre.FICTION,(double)200,LocalDate.of(2007,1,1),"J.K.Rowling",10));
		bookList.put("Deep Work", new Book("Deep Work",Genre.SELFHELP,(double)120,LocalDate.of(2008,11,11),"Cal Newport",1));
		bookList.put("Song of Ice and Fire", new Book("Song of Ice and Fire",Genre.FICTION,(double)100,LocalDate.of(2005,8,8),"George R.R Martin",0));
		bookList.put("Our Oriental Heritage", new Book("Our Oriental Heritage",Genre.HISTORY,(double)150,LocalDate.of(2004,1,10),"Will Durant",5));
		bookList.put("Story of Philosphy", new Book("Story of Philoshpy",Genre.PHILOSPHY,(double)140,LocalDate.of(2006,5,5),"Will Durant",3));
		bookList.put("Socialism:Utopian and Scientific", new Book("Socialism:Utopian and Scientific",Genre.POLITICS,(double)50,LocalDate.of(1890,9,10),"Friedrich Engels",9));
		bookList.put("Das Kapital", new Book("Das Kapital",Genre.ECONOMICS,(double)70,LocalDate.of(1885,4,6),"Karl Marx",10));
		bookList.put("Wealth of Nations", new Book("Wealth of Nations",Genre.ECONOMICS,(double)100,LocalDate.of(1890,3,3),"Adam Smith",5));
	
		return bookList;
	}
}