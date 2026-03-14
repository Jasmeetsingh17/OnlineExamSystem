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

		message.setFrom("gurleenarora011@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);

		javaMailSender.send(message);
		System.out.println("Sent");
	}
	

	public void sendSuccessMail(Users user) {

	    SimpleMailMessage message = new SimpleMailMessage();
	    message.setTo(user.getEmail());
	    message.setFrom("gurleenarora011@gmail.com");
	    message.setSubject("Registration Successful");

	    message.setText(
	        "Dear " + user.getFullname() + ",\n\n" +
	        "Your registration is successful.\n\n" +
	        "Your User ID is: " + user.getUserid() + "\n\n" +
	        "Please keep this ID for future login.\n\n" +
	        "Regards,\nExam Portal Team"
	    );

	    javaMailSender.send(message);
	    System.out.println("Sent");
	}

}