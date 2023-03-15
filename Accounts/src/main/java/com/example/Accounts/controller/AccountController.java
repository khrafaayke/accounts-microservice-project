package com.example.Accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Accounts.model.AccountModel;
import com.example.Accounts.repository.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	private AccountRepository accountRepository;
	
@PostMapping("/accounts")
public AccountModel getAccountDetails(@RequestBody AccountModel account) {
	AccountModel accounts = accountRepository.findByCustomerId(account.getCustomerId());
	return accounts;
}

}
