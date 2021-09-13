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

	//Test on repo branch
	@Test
	void testSaveOnRepo() {
		Book book = new Book("Art of Coding", "JJJ", 120);
		bookRepository.save(book);
	}

	@Test
	void testReadOnRepo() {
		System.out.println(bookRepository.findAll());
	}

	@Test
	void testUpdateOnRepo() {
		Book book = bookRepository.findAll().get(0);
		book.setPage(200);
		bookRepository.save(book);
	}

	@Test
	void testDeleteOnRepo() {
		bookRepository.deleteAll();
	}
}
