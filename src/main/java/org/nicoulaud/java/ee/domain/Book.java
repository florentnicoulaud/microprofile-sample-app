package org.nicoulaud.java.ee.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table
public class Book {

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Integer id;
    @Column
    private String title;
    @Column
    private String author;

    public Book() {
        this.author = "Stephen King";
    }

    public Book(String title) {
        this();
        this.title = title;
    }


}
