package com.gandhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gandhi.models.Book;
import com.gandhi.services.BookService;

@RestController
@RequestMapping("/api/books/")
public class BookController {
	@Autowired
	private BookService bookService;
	
	// GET
	@GetMapping 
	public List<Book> getAllBooks(){
		return bookService.findAllBooks();
	}
	
	// Get one book
	@GetMapping("{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id){
		return bookService.findBookById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	// POST
	@PostMapping
	public Book createBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	// PUT
	
	//DELETE
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable Long id){
		return bookService.findBookById(id)
				.map(book -> {
					bookService.deleteBookById(id);
					return ResponseEntity.ok().<Void>build();
				})
				.orElse(ResponseEntity.notFound().build());
	}
}
