package com.stringoperationtest.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class StringOperationTest {
	
	private static final Logger LOGGER = Logger.getLogger("StringOperationTest");
	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}
	
	@Test
	public void testPalindrom() {
		String src = "ror";
		char[] srcArray = src.toCharArray();
		String destString = "";
		int length=srcArray.length-1;
		for(int i=0;i<srcArray.length;i++) {
			if(length>=0) {
				destString = destString+srcArray[length];
				length--;
			}
		}
		MatcherAssert.assertThat(destString, is(equalTo(src)));
	}
}
