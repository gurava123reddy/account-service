package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Account;
import com.example.demo.entity.Transaction;
import com.example.demo.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
    	// Implement the logic to create an account
    	Account saveAccount = accountService.createAccount(account);
		return saveAccount;
    }

    @GetMapping("/account-service")
    public List<Account> getAllAccounts() {
    	// Implement the logic to get all accounts
    	List<Account> accountsList = accountService.getAllAccounts();
		return accountsList;
    }
    
    @GetMapping
    public List<Transaction> getAllTransactions(){
    	return accountService.getAllTransactions();
    }
    
    @GetMapping("/{accountNumber}")
    public List<Transaction> getByAccountNumber(@PathVariable("accountNumber") String accountNumber){
    	return accountService.getByAccountNumber(accountNumber);
    }
  }
    
    

