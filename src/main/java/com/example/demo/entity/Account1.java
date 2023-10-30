package com.example.demo.entity;


import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(schema = "public", name = "account199")
public class Account1 {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="account_id")
    private int accountId;
    
    @Column(name="account_number")
    private String accountNumber;
    
    // Constructors, getters, and setters
    public Account1() {}
    
    public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}

	