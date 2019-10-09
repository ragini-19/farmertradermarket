package com.jbk.service;

import java.io.File;

public interface MailService {
	
	public void send(String toAddress,String fromtoAddress,String subject,String content )throws Exception;
	
	
	  public void sendHTML(String toAddress,String fromtoAddress,String
	  subject,String content )throws Exception;
	  
	  public void sendHTMLandAttachment(String toAddress,String
	  fromtoAddress,String subject,String content,File file)throws Exception;

}
