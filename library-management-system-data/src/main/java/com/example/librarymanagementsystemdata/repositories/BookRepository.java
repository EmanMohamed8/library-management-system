package com.example.librarymanagementsystemdata.repositories;

import com.example.librarymanagementsystemdata.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
