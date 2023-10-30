package com.example.demo.dto;

import java.util.List;

public class AccountWithTransactionsDTO {
	
	private AccountDTO accountDTO;
    private List<TransactionDTO> lastTransactions;
    
    
	public AccountDTO getAccountDTO() {
		return accountDTO;
	}
	public void setAccountDTO(AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}
	public List<TransactionDTO> getLastTransactions() {
		return lastTransactions;
	}
	public void setLastTransactions(List<TransactionDTO> lastTransactions) {
		this.lastTransactions = lastTransactions;
	}
}
