package org.dummy.emp;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Library_Database")
public class Library {
	
	@Id
	@GeneratedValue
	@Column(name="Book_ID",length=100,unique=true)
	private int id;
	@Column(name="Book_Name",length=150,nullable=false)
	private String name;
	@Column(name="Genre",length=200,nullable=true)
	private String genre;
	@Column(name="Book_price",length=200,nullable=false)
	private float price;
	@Column(name="Author_Name",length=150,nullable=true)
	private String authorName;
	@Column(name="Total_Books",length=150,nullable=false)
	private int totalBooks ;	
	
	
	public Library(int id, String name, String genre, float price, String authorName, int totalBooks) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.price = price;
		this.authorName = authorName;
		this.totalBooks = totalBooks;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


