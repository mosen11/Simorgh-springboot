package nl.simorgh.app;

import nl.simorgh.app.services.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,	classes = SimorghApplication.class)
@TestPropertySource
@AutoConfigureMockMvc
public class SimorghApplicationTests {


//	@MockBean
//	private ProductService productService;

	@Test
	public void contextLoads() {
	}

}
