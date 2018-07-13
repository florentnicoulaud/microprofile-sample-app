package org.nicoulaud.java.ee.repository.config;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.nicoulaud.java.ee.domain.Book;
import org.nicoulaud.java.ee.repository.BookRepository;

@Startup
@Singleton
public class StartupBean {

    @Inject
    private BookRepository bookRepository;

    @PostConstruct
    public void loadInitialData() {
          List<Book> books = new ArrayList<>();
          books.add(new Book("The Running Man"));
          books.add(new Book("Carrie"));
          books.add(new Book("Christine"));
          books.add(new Book("Misery"));
          books.add(new Book("It"));
          books.add(new Book("The Shining"));
          books.add(new Book("The Long Walk"));
          this.bookRepository.saveAll(books);
    }
}
