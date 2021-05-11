package com.ljq.stock.alert.common.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @Description: 邮件发送客户端
 * @Author: junqiang.lu
 * @Date: 2021/4/12
 */
@Component
public class MailClient {

    @Autowired
    private JavaMailSender mailSender;
    /**
     * 发件人邮箱
     */
    @Value("${spring.mail.username}")
    private String from;

    /**
     * 邮件发送
     *
     * @param to 接收人邮箱
     * @param subject 标题
     * @param content 内容 (支持HTML标签)
     */
    public void sendMail(String to, String subject, String content) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        mailSender.send(helper.getMimeMessage());
    }


}