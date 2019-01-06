package com.atm.supportclasses;

import java.util.logging.Logger;

import com.atm.accountexceprion.InsufficientBalanceException;

public class Account {
	
	private static final Logger _LOG = Logger.getLogger("Account.class");
	private int bal;
	public Account(int bal) {
		this.bal=bal;
	}
	
	public int getBalance() {
		return bal;
	}
	public boolean isSufficient(int amnt) {
		if(amnt<(bal-2000)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int withdrawal(int amnt)throws InsufficientBalanceException {
		if(isSufficient(amnt)) {
			bal=bal-amnt;
			_LOG.info("The current bal is  = "+bal);
			return this.bal;
		}
		else {
			throw new InsufficientBalanceException("InSufficient Balance");
		}
	}
}
