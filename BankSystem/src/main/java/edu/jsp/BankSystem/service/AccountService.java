package edu.jsp.BankSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.BankSystem.dto.Account;
import edu.jsp.BankSystem.repo.AccountRepo;

@Service
public class AccountService {

	@Autowired
	private AccountRepo repo;
	
	public Account CreateAccounts(Account a) {
		return repo.save(a);
	}
}
