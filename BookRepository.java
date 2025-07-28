package com.example.bookstore.repository;

import com.example.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
     Page<Book> findByTitleContainingIgnoreCase(String title, Pageable pageable);
}
// This repository interface extends JpaRepository, which provides CRUD operations for the Book entity.