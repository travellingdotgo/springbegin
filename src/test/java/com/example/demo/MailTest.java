package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MailTest {
    @Value("${spring.mail.username}")
    String mailFromUser;

    @Value("${mail.destination}")
    String mailDestination;


    @Value("${mail.test.enable}")
    boolean bEnable;

    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    public void sendSimpleMail(){
        System.out.println("- - - - -  - - - - -  - - sendSimpleMail - - - - - - \n"
                + " mailUser: " + mailFromUser + "  - - - - -  - - - - -  "
                + " bEnable: " + bEnable + "  - - - - -  - - - - -  ");

        if(bEnable){
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(mailFromUser);
            message.setTo(mailDestination);
            message.setSubject("message.setSubject()");
            message.setText("message.setText");
            javaMailSender.send(message);
        }
    }
}