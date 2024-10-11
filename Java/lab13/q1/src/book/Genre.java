package src.book;

public enum Genre{
	FICTION("Fiction"),
	SELFHELP("Self-Help"),
	HISTORY("History"),
	NONFICTION("Non-Fiction"),
	THRILLER("Thriller"),
	POLITICS("Politics"),
	ECONOMICS("Economics"),
	PHILOSPHY("Philosphy"),
	HUMOR("Humor");
	
	private String getGenre;
	Genre(String getGenre){
		this.getGenre = getGenre;
	}
	
	String getGenreName(){
		return getGenre;
	}
}