package com.attendance.serviceregistry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.verify;

@ExtendWith({SpringExtension.class, MockitoExtension.class})
@SpringBootTest
class ServiceRegistryApplicationTests {
	@MockBean
	private ServiceRegistryApplication serviceRegistryApplication;
	@Test
	void contextLoads() {
	}
	@Test
	void testMainMethod() {
		// Mocking SpringApplication.run() method
		String[] args = new String[]{};
		ServiceRegistryApplication.main(args);
		//verify(serviceRegistryApplication).main(args);

	}


}
