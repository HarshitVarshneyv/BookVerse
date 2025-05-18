package com.bookVerse.exception;

public class DuplicateBookExists extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DuplicateBookExists(String msg) {
		super(msg);
	}
}
