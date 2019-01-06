package com.selfcreatedexception.util;

import java.util.logging.Logger;

import com.selfcreatedexception.classes.NotValidAgeException;

public class AgeUtil {
	
	private int age;
	
	public final static Logger deltaLog = Logger.getLogger("AgeUtil");
	public AgeUtil(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

	public String validateAge() {
		if(age<0 || age>110) {
			try {
				throw new NotValidAgeException("-------------------------------- AGE IS INVALID -------------------------------");
			}
			catch(NotValidAgeException e){
				deltaLog.warning(e.getMessage());
				return "fail";
			}
			
		}
	deltaLog.info("------------------- AGE IS VALID ----------------------------");
	 return "pass";
	}
}
