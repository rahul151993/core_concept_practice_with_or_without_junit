package com.atm.mainclass;

import java.util.logging.Logger;

import com.atm.supportclasses.Account;
import com.atm.supportclasses.Customer;

public class AtmApp {
	
	private static final Logger _LOG = Logger.getLogger("AtmApp.class"); 
	public void task() {
		_LOG.info("Hello I am in Main Class");
		Account acc=new Account(5000);
		_LOG.info(""+acc.getBalance());
		Thread t1=new Thread(new Customer("rahul", acc, 1500));
		Thread t2=new Thread(new Customer("akshay", acc, 2000));
		t1.start();
		t2.start();
	}
}
