package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "employees", name = "transaction")
public class Transaction {
    @Id
    private Long transactionId;
    
    private double withDrawnAmount;
    
    private String accountNumber;
    
    public Transaction() {}	

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public double getWithDrawnAmount() {
		return withDrawnAmount;
	}

	public void setWithDrawnAmount(double withDrawnAmount) {
		this.withDrawnAmount = withDrawnAmount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}

   
    
	
	 
	 
	 
    
 