package com.atm.supportclasses;

import java.util.logging.Logger;

import com.atm.accountexceprion.InsufficientBalanceException;

public class Customer implements Runnable {
	
	private static final Logger _LOG = Logger.getLogger("Customer.class");
	private String custName;
	private Account account;
	private int amnt; 
	
	public Customer(String custName,Account account,int amnt) {
		this.custName=custName;
		this.account=account;
		this.amnt=amnt;
	}
	
	@Override
	public void run() {
		synchronized (account) {
			
			try {
				account.withdrawal(amnt);
			} catch (InsufficientBalanceException e) {
				_LOG.warning(e.getMessage());
			}
		}
	}
}
