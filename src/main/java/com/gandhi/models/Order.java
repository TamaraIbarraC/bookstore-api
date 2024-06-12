package com.gandhi.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")	
	private int order_id;
	
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private User user; // Es una instancia, asi que la nombramos en singular "user", no "users" como el nombre de la tabla.
	
	@OneToMany(mappedBy="order")
	private Set<OrderDetail> orderDetail;
	
	// Constructor default:
	public Order() {
		super();
	}


	public Order(int order_id, User user) {
		super();
		this.order_id = order_id;
		this.user = user;
	}

	
	

	public Order(int order_id, User user, Set<OrderDetail> orderDetail) {
		super();
		this.order_id = order_id;
		this.user = user;
		this.orderDetail = orderDetail;
	}


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	

	public Set<OrderDetail> getOrderDetail() {
		return orderDetail;
	}


	public void setOrderDetail(Set<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}


	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", user=" + user + "]";
	}
	
	
	
}
