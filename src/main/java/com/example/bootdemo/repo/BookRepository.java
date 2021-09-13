package com.example.bootdemo.repo;

import com.example.bootdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    //In JPQL

    @Query("from Book")
    List<Book> selectBookInJPQL();
}
