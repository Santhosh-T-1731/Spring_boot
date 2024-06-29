package edu.jsp.BankSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.BankSystem.dto.Account;
import edu.jsp.BankSystem.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService service;
	
	@PostMapping("saveAccount")
	public Account CreateAccount(@RequestBody Account account) {
		return service.CreateAccounts(account);
	}
}
