package gr.bookstore.ws.db;
/*entity class book*/
public class Book {
	private int isbn;
	private String title;
	private int quantity;
	private float price;

	public Book(int isbn, String title, int quantity, float price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}

	public Book(int book) {
		// TODO Auto-generated constructor stub
		this.isbn=book;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
