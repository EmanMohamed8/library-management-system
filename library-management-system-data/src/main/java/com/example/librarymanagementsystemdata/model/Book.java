package com.example.librarymanagementsystemdata.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Book")
public class Book extends BaseEntity {
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String isbn;
    @Column
    private String publisher;
    @Column
    private int pages;
    @Column
    private int publicationYear;
}
