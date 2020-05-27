package com.leapyear;

public class InvaliedValueException extends RuntimeException {

	public InvaliedValueException(String s) {
		super(s);
	}
    public InvaliedValueException(String s, Throwable throwable) {
        super(s, throwable);
    }
    public InvaliedValueException(Throwable throwable) {
        super(throwable);
    }
}
