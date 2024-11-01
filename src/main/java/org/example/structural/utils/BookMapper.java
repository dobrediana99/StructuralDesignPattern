package org.example.structural.utils;


import org.example.structural.dto.BookDto;
import org.example.structural.entity.Book;

public class BookMapper {

    // Convert Book entity to BookDto
    public static BookDto toDTO(Book book) {
        BookDto dto = new BookDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setCategory(book.getCategory());
        return dto;
    }

    // Convert BookDto to Book entity
    public static Book toEntity(BookDto dto) {
        Book book = new Book();
        book.setId(Long.valueOf(dto.getId()));
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setCategory(dto.getCategory());
        return book;
    }
}

