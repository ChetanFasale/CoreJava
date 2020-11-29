package JavaMail;
import java.util.Properties;
 
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
 
public class JavaMailExample {
 
	public static void main(String[] args) {
 
		final String username = Config.email;
		final String password = Config.pwd;
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			MimeMessage message = new MimeMessage(session);
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(Config.email));
			
			message.setSubject("Good Wish");
			message.setText("Dear Friend , Wish you all the best for Placement, Thanks");
			Transport.send(message);
 
			System.out.println("Done completely");
 
		} catch (Exception e) {
			System.out.println("In Catch\t"+e);
		}
	}
}