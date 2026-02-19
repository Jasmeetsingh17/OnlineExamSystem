package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.lti.app.entity.Users;

@Component
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendSimpleEmail(String toEmail, String body, String subject) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("dinishjesudass456@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);

		javaMailSender.send(message);
		System.out.println("Sent");
	}
	

	public void sendSuccessMail(Users user) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getEmail());
		message.setFrom("dinishjesudass456@gmail.com");
		message.setSubject("Registration Successful");
		message.setText("Your registration is successful");

		javaMailSender.send(message);
		System.out.println("Sent");
	}

}