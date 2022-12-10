package enviando.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private String userName = "edgomesdev@gmail.com";
	private String password = "idpafbrujwsrjztl";
	
	@org.junit.Test
	public void testeEmail() {
		
		try {
			
			Properties properties = new Properties();
			
			properties.put("mail.smtp.ssl.trust", "*");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls", "true");
			properties.put("mail.smtp.host", "smtp.gmail.com");
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.socketFactory.port", "465");
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			
			Session session = Session.getInstance(properties, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, password);
				}
			});
			
			Address[] toUser = InternetAddress.parse("edgomesgomes@outlook.com");
			
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName, "Ed Gomes"));
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("Chegou um e-mail enviado com Java");
			message.setText("Olá programador, vc acaba de receber um e-mail enviado com Java do curso formação Java Web do Alex");
			
			Transport.send(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}