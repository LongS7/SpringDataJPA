package com.example.bootdemo;

import com.example.bootdemo.entity.Book;
import com.example.bootdemo.repo.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootdemoApplicationTests {
	@Autowired
	private BookRepository bookRepository;

	//Test on native branch

	@Test
	void testSelect() {
		System.out.println(bookRepository.selectInNative());
	}

}
