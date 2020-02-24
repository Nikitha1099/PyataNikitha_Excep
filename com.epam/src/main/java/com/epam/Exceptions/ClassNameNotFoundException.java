package com.epam.Exceptions;


	public class ClassNameNotFoundException extends Exception {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public ClassNameNotFoundException(String message){
	        super(message);
	    }
	    public ClassNameNotFoundException(String message, Throwable cause){
	        super(message, cause);
	    }
	}


