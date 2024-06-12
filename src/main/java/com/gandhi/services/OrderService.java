package com.gandhi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gandhi.models.Order;
import com.gandhi.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	// GET
	public Optional<Order> findOrderById(Long id){
		return orderRepository.findById(id);
	}
	
	//POST
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
	
	//PUT
	
	//DELETE
	public void deleteOrderById(Long id) {
		orderRepository.deleteById(id);
	}
}
