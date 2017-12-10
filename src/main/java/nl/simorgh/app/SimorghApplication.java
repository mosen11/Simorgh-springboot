package nl.simorgh.app;

import nl.simorgh.app.config.DatasourceConfig;
import nl.simorgh.app.config.EndpointConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication(scanBasePackages = {"nl.simorgh.app.repos", "nl.simorgh.app.jms"})
@EntityScan( basePackages = {"nl.simorgh.app.entity"} )
@Import(value={EndpointConfig.class, DatasourceConfig.class})
@ComponentScan({"nl.simorgh.app"})
public class SimorghApplication extends SpringBootServletInitializer {


	@Autowired
	JmsTemplate jmsTemplate;
	private static final Logger log = LoggerFactory.getLogger(SimorghApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SimorghApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(final BeerRepository repository, final ProductRepository productRepository) {
//		return (args) -> {
//
//			repository.save(new Beer("Amstel", "Niet tasty"));
//			repository.save(new Beer("Heinekein", "Goed"));
//			repository.save(new Beer("Grolsch", "Goed"));
//			Product p1 = new Product();
//			p1.setName("p1");
//			p1.setDescription("desc1");
//			productRepository.save(p1);
//
//			Product p2 = new Product();
//			p2.setName("p2");
//			p2.setDescription("desc2");
//			productRepository.save(p2);
//
//			Product p3 = new Product();
//			p3.setName("p3");
//			p3.setDescription("desc3");
//			productRepository.save(p3);
//			jmsTemplate.convertAndSend("mailbox", new Email("info@example.com", "Hello"));
//			System.out.println("Sending an email message.");
//		};
//	}
}
