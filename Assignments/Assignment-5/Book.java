public class Book {
	private String title;
	private String author;
	private int numPages;
	
	public Book(String title, String author, int numPages) {
		this.title = title;
		this.author = author;
		this.numPages = numPages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPages() {
		return numPages;
	}
	
	public boolean isLonger(Book other) {
		return this.numPages > other.numPages;
	}

	public boolean equals(Book other) {
		return this.title.equals(other.title) 
			&& this.author.equals(other.author)
				&& this.numPages == other.numPages;
	}

	public String toString() {
		return "\"" + title + "\" (" + numPages + ")";
	}
	
}