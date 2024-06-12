package com.gandhi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gandhi.models.Book;
import com.gandhi.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	// GET
	public List<Book> findAllBooks(){
		return bookRepository.findAll();
	}
	
	// GET one Book
	public Optional<Book> findBookById(Long id){
		return bookRepository.findById(id);
	}
	
	// POST
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
	// PUT
	
	
	// DELETE
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
	}
	
	
}
