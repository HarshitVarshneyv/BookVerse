package com.bookVerse.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookVerse.dto.BookDTO;
import com.bookVerse.dto.BookUpdateDTO;
import com.bookVerse.entity.Book;
import com.bookVerse.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService ;
//	public BookController(BookService bookService ) {
//		this.bookService =  bookService ;
//	}
	
	@PostMapping("/books")
	public ResponseEntity<String> saveBook(@RequestBody BookDTO bookDTO){
		bookService.saveBook(bookDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Book saved SuccessFully");
	}
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();      
	}
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable long id) {
		return ResponseEntity.ok(bookService.getBookById(id));
	}   
	
	@PatchMapping("/books/{id}")
	public ResponseEntity<String> updateBookPartially(@PathVariable long id ,@RequestBody BookUpdateDTO bookUpdateDTO){
		bookService.updateBook(id , bookUpdateDTO);
		return ResponseEntity.ok("Book Updated SuccessFully");
	}
	
	@DeleteMapping("/api/books/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable long id){
		bookService.deleteBook(id);
		return ResponseEntity.ok("SuccessFully deleted");
	}
	@GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String author)
                                   {
        return bookService.searchBooks(title, author);
    }
}
