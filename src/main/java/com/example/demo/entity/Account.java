package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema = "employees", name = "account")
public class Account {
    @Id
    private String accountNumber;
    private String ifscCode;
    private String accountHolder;
    private double balance;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="accountNumber", referencedColumnName="accountNumber")
    private List<Transaction> transactions;

    // Constructors, getters, and setters
    public Account() {}

	public Account(String accountNumber, String ifscCode, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    
}

	