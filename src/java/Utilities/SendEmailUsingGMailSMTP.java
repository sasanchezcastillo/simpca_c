/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author Angelita
 */
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.lang3.RandomStringUtils;

public class SendEmailUsingGMailSMTP {
    
    
    public String generaClave(){
        String clave = RandomStringUtils.random(2, false, true)+RandomStringUtils.randomAlphabetic(2);
        return clave;
    }
    
   
    public void enviarCorreo(String correo, String clave){
      String to=correo;
      
      final String username = "angelicabarrientosvera@gmail.com";//change accordingly
      final String password = "90445359D10s";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");      
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(to));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject("Testing Subject");

         // Now set the actual message
         message.setText("\n"+"Use esta clave para poder restablecer la contraseña"+
                         "\n"+"Tu código para restaurar su cuenta es:"+ clave);

         // Send message
         Transport.send(message);

         System.out.println("Sent message successfully....");
         //return true;

      } catch (MessagingException e) {
            throw new RuntimeException(e);
            
      }
      
    }
    

}
