package com.gandhi.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int book_id;
	
	@Column(name="name", nullable=false, length=255)
	private String name;
	
	@Column(name="author", nullable=false, length=255)
	private String author;
	
	@Column(name="stock", nullable=false)
	private int stock;
	
	@Column(name="price", nullable=false)
	private double price;
	
	@OneToMany(mappedBy="book")
	private Set<OrderDetail>orderDetail;
	
	// Constructor default:
	public Book() {
		super();
	}


	public Book(int book_id, String name, String author, int stock, double price) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.author = author;
		this.stock = stock;
		this.price = price;
	}
	
	

	public Book(int book_id, String name, String author, int stock, double price, Set<OrderDetail> orderDetail) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.author = author;
		this.stock = stock;
		this.price = price;
		this.orderDetail = orderDetail;
	}


	public int getBook_id() {
		return book_id;
	}


	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	
	public Set<OrderDetail> getOrderDetail() {
		return orderDetail;
	}


	public void setOrderDetail(Set<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}


	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", name=" + name + ", author=" + author + ", stock=" + stock + ", price="
				+ price + "]";
	}
	
	
}
