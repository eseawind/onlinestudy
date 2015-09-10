package com.common.exception;

@SuppressWarnings("serial")
public class AppException extends RuntimeException{

	  
	  public AppException() {}
	  
	  public AppException(String paramString)
	  {
	    super(paramString);
	  }
	  
	  public AppException(String paramString, Throwable paramThrowable)
	  {
	    super(paramString, paramThrowable);
	  }
	  
	  public AppException(Throwable paramThrowable)
	  {
	    super(paramThrowable);
	  }
	  
}
