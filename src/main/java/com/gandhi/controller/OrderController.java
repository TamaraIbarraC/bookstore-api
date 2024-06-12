package com.gandhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gandhi.models.Order;
import com.gandhi.services.OrderService;

@RestController
@RequestMapping("/orders/")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	//GET
	@GetMapping("{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable Long id){
		return orderService.findOrderById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping
	public Order createOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}
	
	//PUT
	
	//DELETE
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteOrder(@PathVariable Long id){
		return orderService.findOrderById(id)
				.map(Order -> {
					orderService.deleteOrderById(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
}
