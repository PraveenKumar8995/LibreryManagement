package sample.com;

public class Book {


	private int id;
	private String book; 
	private Author author; 
	private float price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", book=" + book + ", author=" + author + ", price=" + price + "]";
	}
	
	

}
