package com.sust.common;

public class MyException extends Exception {
	String message;
	  public MyException(String ErrorMessagr) { // 父类方法 
		    message = ErrorMessagr; 
		  } 
		  
		  public String getMessage() { // 覆盖getMessage()方法 
		    return message; 
		  } 

}
