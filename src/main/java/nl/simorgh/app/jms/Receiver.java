package nl.simorgh.app.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Receiver {

	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	public void receiveMessage(TextMessage email) throws JMSException {
		System.out.println("Received <" + email.getText() + ">");
	}

}
