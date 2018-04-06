package org.nicoulaud.ee.rest.domain;

import lombok.Data;

@Data
public class Book {

    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
    }

}
