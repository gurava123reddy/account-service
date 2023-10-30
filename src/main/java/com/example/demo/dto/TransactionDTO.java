package com.example.demo.dto;

import java.util.Date;

public class TransactionDTO {
	
	private Long transactionId;
	private Date transactionDate;
	private double withDrawnAmount;
	
	
	public TransactionDTO(Long transactionId, Date transactionDate, double withDrawnAmount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.withDrawnAmount = withDrawnAmount;
	}
	
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getWithDrawnAmount() {
		return withDrawnAmount;
	}
	public void setWithDrawnAmount(double withDrawnAmount) {
		this.withDrawnAmount = withDrawnAmount;
	}
}
