package com.bookVerse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookVerse.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

	boolean existsByTitle(String title);
	List<Book> findByTitleContainingIgnoreCase(String title);
	List<Book> findByAuthorContainingIgnoreCase(String author);
	 
}
