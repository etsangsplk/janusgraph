package com.thinkaurelius.titan.exceptions;

public class LockingFailureException extends GraphStorageException {

	public LockingFailureException(String msg) {
		super(msg);
	}
	
	public LockingFailureException(String msg, Throwable e) {
		super(msg,e);
	}

	public LockingFailureException(Throwable e) {
		this("Locking failure", e);
	}
}