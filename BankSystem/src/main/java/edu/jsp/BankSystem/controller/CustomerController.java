package edu.jsp.BankSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.BankSystem.dto.Customer;
import edu.jsp.BankSystem.service.CustomerService;

@RestController

public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping("saveCustomers")
	public Customer CreateCustomer(@RequestBody Customer customer) {
		return service.CreateCustomerAccounts(customer);
	}
	
	@GetMapping("updateCustomers")
	public Customer UpdateCustomer(int id, Customer c) {
		return service.CreateCustomerAccounts(c);
	}
}
