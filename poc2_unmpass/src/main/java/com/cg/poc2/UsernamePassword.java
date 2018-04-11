package com.cg.poc2;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.beans.factory.annotation.Value;


public class UsernamePassword implements Callable{
	
	private String emailId;
	private String userName;
	private String password;
	
	//Reading from the properties File
	//dev.properties file
	
	@Value("${devEmailId}")
	private String devEmail;
	@Value("${devUsername}")
	private String devUsername;
	@Value("${devPassword}")
	private String devPassword;
	
	
	//test.properties file
	
	@Value("${testEmailId}")
	private String testEmail;
	@Value("${testUsername}")
	private String testUsername;
	@Value("${testPassword}")
	private String testPassword;
		
		
	//prod.properties file
		
	@Value("${prodEmailId}")
	private String prodEmail;
	@Value("${prodUsername}")
	private String prodUsername;
	@Value("${prodPassword}")
	private String prodPassword;
	
	
	public String isDevValid(String inputEmail, String inputUserName, String inputPassword) throws InvalidLoginException {
		String result = new String();
		System.out.println("EMAILID - " + devEmail + "USERNAME - " + devUsername + "PSWD - " + devPassword);
		if (inputEmail.equals(devEmail) && inputUserName.equals(devUsername) && inputPassword.equals(devPassword)) {
			result = "Login Successfull as DEVELOPER";
		}else
			throw new InvalidLoginException("Username, Password and emailID does not match");
		return result;
	}
	
	
	public String isProdValid(String inputEmail, String inputUserName, String inputPassword) throws InvalidLoginException {
		String result = new String();
		System.out.println("EMAILID - " + prodEmail + "USERNAME - " + prodUsername + "PSWD - " + prodPassword);
		if (inputEmail.equals(prodEmail) && inputUserName.equals(prodUsername) && inputPassword.equals(prodPassword)) {
			result = "Login Successfull as PRODUCTION";
		}else
			throw new InvalidLoginException("Username, Password and emailID does not match");
		return result;
	}

	public String isTestValid(String inputEmail, String inputUserName, String inputPassword) throws InvalidLoginException {
		String result = new String();
		System.out.println("EMAILID - " + testEmail + "USERNAME - " + testUsername + "PSWD - " + testPassword);
		System.out.println(testEmail);
		if (inputEmail.equals(testEmail) && inputUserName.equals(testUsername) && inputPassword.equals(testPassword)) {
			result = "Login Successfull as TESTER";
		}else
			throw new InvalidLoginException("Username, Password and emailID does not match");
		return result;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
