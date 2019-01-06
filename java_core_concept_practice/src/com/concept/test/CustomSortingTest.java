package com.concept.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

import com.concept.entity.Student;
import com.concept.practice.CustomSorting;

public class CustomSortingTest {
	
	private CustomSorting custSorting;
	
	@Before
	public void setCustomSorting() {
		custSorting = new CustomSorting();
	}
	
	@Test
	public void test_01() {
		assertTrue(true);
	}
	
	@Test
	public void test_notnull_02() {
		assertNotNull(custSorting);
	}
	
	@Test
	public void test_CustomSorting() {
		ArrayList<Student> stdList = new ArrayList<>();
		Student s1 = new Student(10,"kelly");
		Student s2 = new Student(1,"johnson");
		Student s3 = new Student(8,"rob");
		Student s4 = new Student(5,"jackson");
		Student s5 = new Student(9,"jerry");
		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		stdList.add(s5);
		stdList.stream().forEach(s->System.out.println("The RollNo is = "+s.getRollno()+" name is = "+s.getName()));
		Collections.sort(stdList, new Comparator<Student>() {
			@Override
			public int compare(Student std1, Student std2) {
				if(std1.getRollno()>std2.getRollno())
					return 1;
				else if(std1.getRollno()<std2.getRollno())
					return -1;
				return 0;
			}
		});
		System.out.println("----------------------------------------------------------");
		stdList.stream().forEach(s->System.out.println("The RollNo is = "+s.getRollno()+" name is = "+s.getName()));
	}
}
