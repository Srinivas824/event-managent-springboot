package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepositry;
import com.example.demo.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerRepositry crjpa;
	
	
	@Transactional
	public void register(Customer customer) {
		crjpa.save(customer);
	}
	@Transactional
	public List<Customer>displayAllCustomers(){
		return crjpa.findAll();
	}
	@Transactional
	public void removeBasedById(int customerId) {
		crjpa.deleteById(customerId);
	}
	@Transactional
	public Customer selectCustomerBasedById(int customerId) {
		return crjpa.findById(customerId).get();
	}
	@Transactional
	public void update(Customer customer) {
		crjpa.save(customer);
	}
	
}
