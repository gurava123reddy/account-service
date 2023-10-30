package com.example.demo.client;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Account1;

@Component
public class Account1Client {

    @Autowired
    private RestTemplate restTemplate;

    public void saveAccount1(Account1 account1, String accountNumber) {
        // Set the account number in the account1 object
        account1.setAccountNumber(accountNumber);

        // Set the request headers
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        
        // Create an HTTP entity with the account1 object and headers
        HttpEntity<Account1> httpEntity = new HttpEntity<>(account1, httpHeaders);

        // Define the URL for the remote service (replace with the actual URL)
        String remoteServiceUrl = "http://localhost:8082/create-account";

        // Send an HTTP POST request with the entity
        restTemplate.exchange(remoteServiceUrl, HttpMethod.POST, httpEntity, String.class);
    }
}
