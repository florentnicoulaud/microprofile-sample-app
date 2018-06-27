package org.nicoulaud.java.ee.repository;

import org.nicoulaud.java.ee.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
