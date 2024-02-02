package edu.example.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;
}

