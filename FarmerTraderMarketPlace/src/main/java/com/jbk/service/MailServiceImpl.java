package com.jbk.service;

import java.io.File;
import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl  implements MailService{
	
	@Autowired
	private JavaMailSender javaMailSender;
		
		

		@Override
		public void sendHTML(String toAddress, String fromtoAddress, String subject, String content) throws Exception {
			MimeMessage mimiMessage=javaMailSender.createMimeMessage();
			MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimiMessage);
			mimeMessageHelper.setFrom(fromtoAddress);
			mimeMessageHelper.setTo(toAddress);
			mimeMessageHelper.setSubject(subject);
			mimeMessageHelper.setText(content, true);
			mimeMessageHelper.setSentDate(new Date());
			javaMailSender.send(mimiMessage);
		}

		@Override
		public void send(String toAddress, String fromtoAddress, String subject, String content) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void sendHTMLandAttachment(String toAddress, String fromtoAddress, String subject, String content,
				File file) throws Exception {
			
			
		}


		


}
