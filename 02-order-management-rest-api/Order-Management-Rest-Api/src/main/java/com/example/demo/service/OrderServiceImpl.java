package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.entity.Order;

@Service 
public class OrderServiceImpl implements OrderService
{

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public Order getOrderById(Integer id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).orElse(null);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		
		return orderRepository.findAll();
	}

	
	
}
