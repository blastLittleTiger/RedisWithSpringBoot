package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zishan.spring.SpringRedisCacheApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringRedisCacheApplication.class)
@WebAppConfiguration
public class SpringRedisCacheApplicationTests {

	@Test
	public void contextLoads() {
	}

}
