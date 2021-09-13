package com.example.bootdemo;

import com.example.bootdemo.repo.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootdemoApplicationTests {
	//Test on JPQL branch------

	@Autowired
	private BookRepository repository;

	@Test
	void testSelect() {
		System.out.println(repository.selectBookInJPQL());
	}
}
