package ru.skypro;

public class Library {
    private Book[] books;

    public Library(int countBook) {
        this.books = new Book[countBook];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        System.out.println("Ошибка ! библиотека полная,книга не добавлена!");
    }

    public void printBook(String name) {
        for (Book book : books) {
            if (book == null) {continue;};
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println(book.toString());
                return;
            }
        }
        System.out.println("нет такой книги");
    }


    public void setYearPublishing(String name, int year) {
        for (Book book : books) {
            if (book == null) {continue;};
            if (book.getName().equalsIgnoreCase(name)) {
                book.setYearPublishing(year);
                return;
            }
        }
        System.out.println("книга не найдена!");

    }


    public void printBooks() {
        for (Book book : books) {
            if (book == null) continue;
            System.out.println("Книга:" + " " + book.toString());
        }
    }
}
