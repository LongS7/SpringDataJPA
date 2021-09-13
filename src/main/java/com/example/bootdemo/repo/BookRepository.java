package com.example.bootdemo.repo;

import com.example.bootdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(
            value = "select * from book",
            nativeQuery = true
    )
    List<Book> selectInNative();

    @Query(
            value = "delete * from book",
            nativeQuery = true
    )
    void deleteInNative();
}
