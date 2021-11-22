package ru.skypro;

import java.util.Objects;

public class Book {
    private final String name;
    private int yearPublishing;
    private final Author author;

    public Book(String name, int yearPublishing, Author author ) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.author= author;
    }

    public Author getAuthor () {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;

    }
    @Override
    public  String toString(){
        return name + ": " + yearPublishing + " года издания" + " " + author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}



