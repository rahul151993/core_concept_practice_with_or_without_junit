package com.atm.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.atm.accountexceprion.InsufficientBalanceException;
import com.atm.mainclass.AtmApp;
import com.atm.supportclasses.Account;
import com.atm.supportclasses.Customer;

public class AtmAppTest {
	
	private static final Logger _LOG = Logger.getLogger("AtmAppTest.class");
	private Account account=null;
	private Customer c1 =null;
	private Customer c2=null;
	
	/*@Before
	public void preTestTask() {
		account = new Account(5000);
		c1=new Customer("rahul",account,1500);
		c2=new Customer("Akshay",account,2000);
	}
	
	@After
	public void postTestTask() {
		account=null;
		c1=null;
		c2=null;
	}
	
	
	@Test
	public void assertTrue() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void notNullAtmClass() {
		assertNotNull(account);
		assertNotNull(c1);
		assertNotNull(c2);
	}
	
	@Test
	public void accountTest() {
		try {
		MatcherAssert.assertThat(account.withdrawal(2000), is(equalTo(3000)));
		}
		catch (InsufficientBalanceException e) {
			_LOG.warning(e.getMessage());
		}
	}*/
	
	@Test
	public void threadTest() {
		AtmApp app=new AtmApp();
		assertNotNull(app);
		app.task();
	}
}
