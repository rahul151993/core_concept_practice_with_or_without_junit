package com.selfcreatedexception.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;

import com.selfcreatedexception.util.AgeUtil;

@FixMethodOrder
public class SelfExceptionTest {
	
	private final static Logger charliLog = Logger.getLogger("SelfEceptionTest");
	
	private AgeUtil ageUtility;
	
	@Before
	public void beforeTest() {
		ageUtility=new AgeUtil(73);
		charliLog.info("Hello Charlie you are in the beforetest");
	}
	
	@Test
	public void test_01_notNull()throws Exception {
		assertNotNull(ageUtility);
	}
	
	@Test
	public void test_02_checkForValidAge()throws Exception {
		MatcherAssert.assertThat(ageUtility.validateAge(), is(equalTo("pass")));
	}
	
	@Test
	public void test_03_checkForInvalidAge()throws Exception {
		ageUtility.setAge(-111);
		MatcherAssert.assertThat(ageUtility.validateAge(),is(equalTo("fail")));
	}

	@After
	public void afterTest() {
		ageUtility=null;
		charliLog.info("you are in the after test");
	}
}