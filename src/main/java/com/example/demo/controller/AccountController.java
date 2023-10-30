package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.Account1Client;
import com.example.demo.dto.AccountDTO;
import com.example.demo.entity.Account;
import com.example.demo.entity.Account1;
import com.example.demo.repository.AccountRepository;

@RestController
public class AccountController {
	
	private AccountRepository accountRepository;
	
	@Autowired
	 Account1Client account1Client;

	@Autowired
	public AccountController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	 @PostMapping("/create-account")
	    public ResponseEntity<String> createAccount(@RequestBody AccountDTO accountDTO) {
		 Account savedAccount = accountRepository.save(accountDTO.getAccount());
		 if(savedAccount != null && savedAccount.getAccountNumber()!= null) {
			 Account1 account1 = accountDTO.getAccount1();
			 account1Client.saveAccount1(account1, savedAccount.getAccountNumber());
		 }
	        return new ResponseEntity<>("Account saved in both the services successfully with account number: "+
	        		savedAccount.getAccountNumber(), HttpStatus.CREATED);
	 }
}
