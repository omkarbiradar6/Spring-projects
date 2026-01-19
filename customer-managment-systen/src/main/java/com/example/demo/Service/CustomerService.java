package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;

@Service
public interface CustomerService
{

	
	public Customer createCustomer(Customer customer);
	public Customer getCustomerById(Integer customerId);
	public Customer updateCustomer(Integer customerId,Customer customer);
	public void deleteCustomer(Integer customerId);
	
	
}
