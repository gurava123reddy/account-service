package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Account;
import com.example.demo.entity.Transaction;

public interface AccountService {
    Account createAccount(Account account);
    List<Account> getAllAccounts();
	List<Transaction> getAllTransactions();
	List<Transaction> getByAccountNumber(String accountNumber);
}
