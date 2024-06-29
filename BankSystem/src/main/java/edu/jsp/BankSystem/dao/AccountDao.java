package edu.jsp.BankSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.BankSystem.dto.Account;
import edu.jsp.BankSystem.dto.Customer;
import edu.jsp.BankSystem.repo.AccountRepo;

@Service
public class AccountDao {

	@Autowired
	private AccountRepo repo;
	
	public List<Account> getAll(){
		return repo.findAll();
	}
	
	public Account saveAccount(Account account) {
		return repo.save(account);
	}

	public Customer fetchById(int id) {
	
		return null;
	}
}
