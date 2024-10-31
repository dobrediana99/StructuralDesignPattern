package org.example.structural.service;


import org.example.structural.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class LibraryFacade {

    private final BookService bookService;

    @Autowired
    public LibraryFacade(BookService bookService) {
        this.bookService = bookService;
    }

    // Simplified method to add a book
    public Book addBook(Book book) {
        return bookService.saveBook(book);
    }

    // Simplified method to find books by category
    public List<Book> findBooksByCategory(String category) {
        return bookService.getBooksByCategory(category);
    }

    // Additional simplified facade methods
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    public Optional<Book> findBookById(Long id) {
        return bookService.findBookById(id);
    }

    public void deleteBook(Long id) {
        bookService.deleteBook(id);
    }
}
