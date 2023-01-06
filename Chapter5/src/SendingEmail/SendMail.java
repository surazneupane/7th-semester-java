package SendingEmail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void main(String[] args) {

//        sender
        final String username = "suraznep@gmail.com";//change accordingly
        final String password = "wfszlourssbhzqdg";//change accordingly

//        receiver
        String to = "suraznep@gmail.com";//change accordingly

        Properties props = new Properties();
//        set authentication as smtp
        props.put("mail.smtp.auth", "true");
//        enable transport layer security
        props.put("mail.smtp.starttls.enable", "true");
//        set mail host
        props.put("mail.smtp.host", "smtp.gmail.com");
//        set mail port
        props.put("mail.smtp.port", "587");

//         get mail session
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication
                    getPasswordAuthentication() {
                        return new
                                PasswordAuthentication(username, password);
                    }
                });

        //Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.addRecipient(Message.RecipientType.CC, new InternetAddress("email address"));

            message.setSubject("Test");
            message.setContent(
                    "<b>This is a test message</b>",
                    "text/html; charset=UTF-8"
            );

//            attach a file
            message.setFileName("email.jpg");

            //send the message
//            Transport class is used as a message transport mechanism.
            Transport.send(message);

            System.out.println("message sent successfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
