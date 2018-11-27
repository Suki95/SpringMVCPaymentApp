package com.bamspringmvc.dao;

import java.util.List;

import com.bamspringmvc.dto.Customer;
import com.bamspringmvc.dto.Transaction;

public interface CustomerDAO {

	public void addCustomer(Customer customer);
	
	public String deposit(String cmobno, double cbal);
	
	public String withdraw(String cmobno, double cbal);
	
	public String checkBalance(String cmobno);
	
	public String tfy(String cmobno, String rno, double cbal);
	
	public List<Transaction> displayTransactions();
}
