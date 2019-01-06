package com.selfcreatedexception.classes;


public class NotValidAgeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotValidAgeException(String message) {
		super(message);
	}
}
