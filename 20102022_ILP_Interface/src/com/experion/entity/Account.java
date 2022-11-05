package com.experion.entity;

public class Account extends Product implements CardAccountService {

	private String accountNumber;
	private double accountBalance;

	public Account(String productName, String accountNumber, double accountBalance) {
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public void checkProductValidity() {
		System.out.println("Validity check of Account class called");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Validity check of acc class calledd");
	}

	@Override
	public void cashWithdrawal() {
		// TODO Auto-generated method stub
		System.out.println("acc balance is checked");
	}

}
