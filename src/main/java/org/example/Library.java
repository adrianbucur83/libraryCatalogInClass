package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library extends Object {
    public List<Book> books = new ArrayList<>();

    /**
     * This method adds books to the catalog. Takes
     * @param book and displays an error if the library is full
     */
    public void addBook(Book book) {
        if (books.size() >= 4) {
            System.out.println("Library is full");
            return;
        }
        books.add(book);
    }

    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void deleteBook(Book book) {
        if (!books.contains(book)) {
            System.out.println("Book not found in the list");
        }

        System.out.println("Deleting book: " + book);
        books.remove(book);
    }

    public void deleteBookByName(String bookName) {
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(bookName)){
                System.out.println("Deleting book: " + book);
                books.remove(book);
                return;
            }
        }

        System.out.println("Book not found: " + bookName);

    }

}
