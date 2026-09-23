package com;

public class VoteException extends Exception{

	public VoteException() {
		// TODO Auto-generated constructor stub
		super();		// by default present in every sub class constructor which help to call super class constructor 
	}
	public VoteException(String msg) {
		//super(); // it call empty constructor of Exception class. 
		super(msg); // we are calling super class parameterized constructor ie Exception 
	}
}
