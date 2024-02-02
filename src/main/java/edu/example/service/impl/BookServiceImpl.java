package edu.example.service.impl;

import edu.example.dto.BookDto;
import edu.example.entity.Book;
import edu.example.repository.BookRepository;
import edu.example.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    ModelMapper mapper;
    @Bean
    public void setup(){
       this.mapper=new ModelMapper();
    }


    @Override
    public void addBook(BookDto bookDto) {
        Book book=mapper.map(bookDto, Book.class);
        System.out.println(book);
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {

        return bookRepository.findAll();

    }

    @Override
    public Book getById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
