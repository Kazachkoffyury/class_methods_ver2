package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author firstAuthore = new Author("Жюль","Верн");
        Author authore1 = new Author("Жюль","Верн");
        Author secondAuthore = new Author("Даниэль", "Дефо");
        Book book = new Book("20 тысяч лье под водой", 1870, firstAuthore);
        Book book2 = new Book("20 тысяч лье под водой", 1870, firstAuthore);
        Book book3 = new Book("таинственный остров", 1875, firstAuthore);
        Book book4 = new Book("путешествие к центру земли", 1864, firstAuthore);
        Book book5 = new Book("вокруг света за 80 дней", 1872, firstAuthore);
        Book book6 = new Book("Робинзон Крузо", 1719, secondAuthore);
        Book book7 = new Book("Робинзон Крузо", 1719, secondAuthore);
        book5.setYearPublishing(1725);
        Library library = new Library(6);
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.printBook("робинзон Крузо");
        library.setYearPublishing("робинзон Крузо", 1800);
        library.printBook("робинзон Крузо");
        library.printBooks();
    }
}
