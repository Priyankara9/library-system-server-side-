package edu.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    @Id
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Integer qty;
}

