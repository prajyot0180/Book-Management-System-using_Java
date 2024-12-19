package com.prajyot.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prajyot.Project.models.Book;
import com.prajyot.Project.services.BookService;

@RestController
@CrossOrigin(origins = "/*")
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping("/book")
	public String greatings() {
		return "All Book of prajyot";
	}
	
	@GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }
	@GetMapping("/books/{tittle}")
    public ResponseEntity<Book> getBookByTittle(@PathVariable String tittle) {
		 Book books = bookService.getBookByTittle(tittle);
            return ResponseEntity.ok(books);
        }
    

    // Add a new book (only accessible by admin)
    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return ResponseEntity.ok("Book added successfully!");
    }

    // Update an existing book (only accessible by admin)
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateBook(@PathVariable Long id, @RequestBody Book book) {
        bookService.updateBook(id, book);
        return ResponseEntity.ok("Book updated successfully!");
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully!");
    }

    

    
    // Get a book by its ID (can be accessed by any user)
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
        
    }
}
