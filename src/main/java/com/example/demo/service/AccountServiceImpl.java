package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Account;
import com.example.demo.entity.Transaction;
import com.example.demo.repository.AccountRepository;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
	
    private final AccountRepository accountRepository;
    
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createAccount(Account account) {
    	// Implement the logic to create an account
		return accountRepository.save(account);
        
    }

    @Override
    public List<Account> getAllAccounts() {
    	 // Implement the logic to get all accounts
		return accountRepository.findAll();
       
    }

    @Override
    public List<Transaction> getAllTransactions() {
        String transactionServiceUrl = "http://localhost:8082"; // Replace with the actual URL of the Transaction Service

        String url = transactionServiceUrl + "/transactions";

        ResponseEntity<List<Transaction>> response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Transaction>>() {}
        );

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            // Handle errors or return an empty list
            return Collections.emptyList();
        }
   }

	@Override
	public List<Transaction> getByAccountNumber(String accountNumber) {
		String transactionServiceUrl = "http://localhost:8082"; // Replace with the actual URL of the Transaction Service

        String url = transactionServiceUrl + "/transactions/56789EF";

        ResponseEntity<List<Transaction>> response = restTemplate.exchange(
            url,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Transaction>>() {}
        );

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            // Handle errors or return an empty list
            return Collections.emptyList();
        }
	}

}
