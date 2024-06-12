package com.gandhi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_detail_id")
	private int order_detail_id;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;
	
	@Column(name="quantity", nullable=false)
	private int quantity;


	public OrderDetail() {
		super();
	}


	public OrderDetail(int order_detail_id, Order order, Book book, int quantity) {
		super();
		this.order_detail_id = order_detail_id;
		this.order = order;
		this.book = book;
		this.quantity = quantity;
	}


	public int getOrder_detail_id() {
		return order_detail_id;
	}


	public void setOrder_detail_id(int order_detail_id) {
		this.order_detail_id = order_detail_id;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "OrderDetail [order_detail_id=" + order_detail_id + ", order=" + order + ", book=" + book + ", quantity="
				+ quantity + "]";
	}
	
	
}
