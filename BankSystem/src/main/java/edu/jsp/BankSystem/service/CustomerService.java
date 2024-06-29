package edu.jsp.BankSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.BankSystem.dao.AccountDao;
import edu.jsp.BankSystem.dao.CustomerDao;
import edu.jsp.BankSystem.dto.Account;
import edu.jsp.BankSystem.dto.Customer;
import edu.jsp.BankSystem.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao dao;
	
	@Autowired
	private AccountDao accountdao;
	
	public Customer CreateCustomerAccounts(Customer c) {
		return dao.saveCustomer(c);
	}
	
	public Customer saveCustomer(int id, Account accounts) {
		Customer c=accountdao.fetchById(id);
		
		if(c!=null) {
			List<Account>list=c.getAccounts();
			list.add(accounts);
			
			dao.updateCustomer(c);
			return c;
		}
		return null;
	}
}
