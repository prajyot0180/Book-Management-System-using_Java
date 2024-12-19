package com.prajyot.Project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prajyot.Project.models.Book;
import com.prajyot.Project.repository.BookRepo;


@Service
public class BookService {

	@Autowired
	BookRepo bookRepo;
	
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	public Book getBookById(Long id) {
		return bookRepo.findById(id).orElseThrow();
	}

	public void addBook(Book book) {
		bookRepo.save(book);
	}

	public void updateBook(Long id, Book book) {
		Book updatedBook = getBookById(id);
		updatedBook.setAuthor(book.getAuthor());
		updatedBook.setGenre(book.getGenre());
		updatedBook.setPrice(book.getPrice());
		updatedBook.setTitle(book.getTitle());
		bookRepo.save(updatedBook);
	}

	public void deleteBook(Long id) {
		bookRepo.deleteById(id);;
	}

	
	public Book getBookByTittle(String tittle) {
		return 	bookRepo.findByTitleContainingIgnoreCase(tittle);
	
	}

	

}
