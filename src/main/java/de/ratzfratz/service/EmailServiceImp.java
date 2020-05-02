package de.ratzfratz.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImp {

private JavaMailSender email;

public JavaMailSender getEmail() {
    return email;
}

public void setEmail(JavaMailSender email) {
    this.email = email;
}

public EmailServiceImp(JavaMailSender email) {
    this.email = email;
}

public EmailServiceImp() {
}

public void sendMail(String toEmail, String subject, String message) {

    SimpleMailMessage mailMessage = new SimpleMailMessage();

    mailMessage.setTo(toEmail);
    mailMessage.setSubject(subject);
    mailMessage.setText(message);

    mailMessage.setFrom("service@ratz-fratz.de");

    email.send(mailMessage);
}
    
}