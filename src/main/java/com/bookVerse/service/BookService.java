package com.bookVerse.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookVerse.dto.BookDTO;
import com.bookVerse.dto.BookUpdateDTO;
import com.bookVerse.entity.Book;
import com.bookVerse.exception.BookNotFoundException;
import com.bookVerse.exception.DuplicateBookExists;
import com.bookVerse.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository bookRepository;

	public void saveBook(BookDTO bookDTO) {
		// TODO Auto-generated method stub
		if(bookRepository.existsByTitle(bookDTO.getTitle())){
			throw new DuplicateBookExists("Try Unique Book Name");
		}
		Book book = Book.builder()
				.title(bookDTO.getTitle())
				.author(bookDTO.getAuthor())
				.price(bookDTO.getPrice())
				.stock(bookDTO.getStock())
				.publishedDate(bookDTO.getPublishedDate())
				.build();
		bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public Book getBookById(Long id) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundException("This book does not Exists"));
		return book;
	}

	public void updateBook(long id ,BookUpdateDTO dto) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findById(id)
				.orElseThrow(() -> new BookNotFoundException("This book does not Exists"));
		
		    dto.getTitle().ifPresent(book::setTitle);
		    dto.getAuthor().ifPresent(book::setAuthor);
		    dto.getPrice().ifPresent(book::setPrice);
		    dto.getStock().ifPresent(book::setStock);
		    dto.getPublishedDate().ifPresent(book::setPublishedDate);
		    bookRepository.save(book);
	}

	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		 Book book = getBookById(id);
		 bookRepository.delete(book);
	}
	
    public List<Book> searchBooks(String title, String author) {
	        if (title != null) return bookRepository.findByTitleContainingIgnoreCase(title);
	        if (author != null) return bookRepository.findByAuthorContainingIgnoreCase(author);
	        return getAllBooks();
	    }
	 
}
