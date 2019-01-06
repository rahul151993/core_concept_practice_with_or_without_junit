package com.arrayoperationtest.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.arrayoperationtest.main.AlternateMerger;

public class ArraysOperationTest {
	
	private static AlternateMerger altMerger;
	
	@Before
	public void setDataFirst() {
		altMerger = new AlternateMerger();
	}
	
	@After
	public void unsetLast() {
		altMerger=null;
	}
	
	@Test
	public void assertTrueTest() {
		assertTrue(true);
	}
	
	@Test
	public void alternateMergeTest1() {
		int[] fa= {1,3,5,7,9,11,13};
		int[] sa= {2,4,6,8,10,12,14};
		altMerger.setFa(fa);
		altMerger.setSa(sa);
		int[] result = altMerger.display();
		int[] alternateCompare = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		MatcherAssert.assertThat(result, is(equalTo(alternateCompare)));
	}
	
	@Test
	public void alternateMergeTest2() {
		int[] fa= {1,3,5,7};
		int[] sa= {2,4,6,8,9,10,11};
		altMerger.setFa(fa);
		altMerger.setSa(sa);
		int[] result = altMerger.display();
		int[] alternateCompare = {1,2,3,4,5,6,7,8,9,10,11};
		MatcherAssert.assertThat(result, is(equalTo(alternateCompare)));
	}
	
	@Test
	public void alternateMergeTest3() {
		int[] fa= {1,3,5,7,9,10,11,12,13,14};
		int[] sa= {2,4,6,8};
		altMerger.setFa(fa);
		altMerger.setSa(sa);
		int[] result = altMerger.display();
		int[] alternateCompare = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		MatcherAssert.assertThat(result, is(equalTo(alternateCompare)));
	}
	
	@Test
	public void alternateMergeTest4() {
		int[] fa= {1,3,5,7,9,10,11,12,13,14};
		int[] sa= null;
		altMerger.setFa(fa);
		altMerger.setSa(sa);
		int[] result = altMerger.display();
		int[] alternateCompare = {1,3,5,7,9,10,11,12,13,14};
		MatcherAssert.assertThat(result, is(equalTo(alternateCompare)));
	}
	
	@Test
	public void alternateMergeTest5() {
		int[] fa= null;
		int[] sa= {2,4,6,8};
		altMerger.setFa(fa);
		altMerger.setSa(sa);
		int[] result = altMerger.display();
		int[] alternateCompare = {2,4,6,8};
		MatcherAssert.assertThat(result, is(equalTo(alternateCompare)));
	}
	
	@Test
	public void alternateMergeTest6() {
		int[] fa= null;
		int[] sa= null;
		altMerger.setFa(fa);
		altMerger.setSa(sa);
		int[] result = altMerger.display();
		int[] alternateCompare = null;
		MatcherAssert.assertThat(result, is(equalTo(alternateCompare)));
	}
}