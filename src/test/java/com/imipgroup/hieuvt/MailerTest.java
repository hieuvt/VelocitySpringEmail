package com.imipgroup.hieuvt;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailerTest extends TestCase {
    public void testSendMail() {

        Mail mail = new Mail();
        mail.setMailFrom("hieuvt2008@gmail.com");
        mail.setMailTo("hieu.vutrong@imipgroup.com");
        mail.setMailSubject("Subject - Send Email using Spring Velocity Template");
        mail.setTemplateName("emailtemplate.vm");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Mailer mailer = (Mailer) context.getBean("mailer");
        mailer.sendMail(mail);
    }

}