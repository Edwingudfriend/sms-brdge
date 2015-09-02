package org.mifos.sms.exception;

/** 
 * Exception is thrown during the normal operation of the Java Virtual Machine when a query for SMS
 * messages returns an empty result set
 * 
 * @author Emmanuel Nnaa
 **/
public class SmsOutboundMessageNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -942901893587315527L;

    /** 
	 * SmsOutboundMessageNotFoundException constructor
	 * 
	 * @param message the exception message
	 * @return void
	 **/
	public SmsOutboundMessageNotFoundException(String message) {
		super(message);
	}
}
