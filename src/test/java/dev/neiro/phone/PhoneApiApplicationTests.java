package dev.neiro.phone;

import dev.neiro.phone.repository.PhoneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhoneApiApplicationTests {
	@Autowired
	private PhoneRepository repository;

	@Test
	void contextLoads() {

	}

}
