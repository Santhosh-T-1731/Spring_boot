package edu.jsp.BankSystem.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.jsp.BankSystem.dto.Account;
import edu.jsp.BankSystem.dto.Customer;
import edu.jsp.BankSystem.repo.CustomerRepo;

@Service
public class CustomerDao {

	private CustomerRepo repo;
	
	public List<Customer> getAll(){
		return repo.findAll();
	}
	
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}
	
	public List<Customer> getAllAccounts(){
		return repo.findAll();
	}

	public List<Customer> updateAccount(Account accounts) {
		return repo.findAll();
	}

	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		
	}

//	public Customer save(Customer c) {
//		
//		return null;
//	}
}
