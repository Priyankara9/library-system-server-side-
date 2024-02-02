package edu.example.controller;

import edu.example.dto.BookDto;
import edu.example.entity.Book;
import edu.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/add")
    public void addBook(@RequestBody BookDto bookDto){
        bookService.addBook(bookDto);
    }
    @GetMapping("/get")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/getOne/{id}")
    public Book getById(Long id) {
        return bookService.getById(id);
    }

}
