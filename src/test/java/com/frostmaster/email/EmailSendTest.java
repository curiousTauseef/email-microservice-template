package com.frostmaster.email;

import static org.junit.Assert.assertEquals;

import com.frostmaster.email.entity.Email;
import com.frostmaster.email.service.impl.EmailServiceImpl;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class EmailSendTest {

  @Autowired
  EmailServiceImpl emailService;

  @Rule
  public SmtpServerRule smtpServerRule = new SmtpServerRule(2525);

  @Test
  public void testSend() throws MessagingException {
    Email email = Email.builder()
        .to("tets@test.com")
        .from("Test@Test.com")
        .subject("Test")
        .body("test")
        .build();
    emailService.sendEmail(email);

    MimeMessage[] receivedMessages = smtpServerRule.getMessages();
    assertEquals(1, receivedMessages.length);

  }

}
