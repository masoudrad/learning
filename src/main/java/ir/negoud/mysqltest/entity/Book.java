package ir.negoud.mysqltest.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Book {
	
	@Id
	private String isbn;
	
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
