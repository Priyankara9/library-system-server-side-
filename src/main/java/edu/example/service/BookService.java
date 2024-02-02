package edu.example.service;

import edu.example.dto.BookDto;
import edu.example.entity.Book;

import java.util.List;

public interface BookService {
    public void addBook(BookDto book);
    public List<Book> getAllBooks();
    public Book getById(Long id);
    public boolean deleteById(Long id);
    public boolean upDateBook(Book book);

}
