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
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="username", nullable=false, length=255)
	private String username;
	
	@OneToMany(mappedBy="user")
	private Set<Order> orders;
	
	// Constructor default:
	public User() {
		super();
	}
	public User(int user_id, String username) {
		super();
		this.user_id = user_id;
		this.username = username;
	}
	
	
	
	public User(int user_id, String username, Set<Order> orders) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.orders = orders;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + "]";
	}
	
	
}
