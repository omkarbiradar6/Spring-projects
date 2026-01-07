package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController 
{

	@Autowired
	private OrderService orderService;
	
	@PostMapping
	public Order createOrder(@RequestBody   Order order)
	{
		return orderService.createOrder(order);
		
		
	}
	
	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable Integer id)
	{
		return orderService.getOrderById(id);
		
	}
	
	@GetMapping
	public List<Order> getAllOrders()
	{
		return orderService.getAllOrders();
		
		
		
	}
	
	
	
}
