package org.example;

/**
 create a small application that mimics a library catalog.      //Library
 There are 3 separate Book properties in the LibraryCatalog.   // Book & LibraryCatalog
 It needs to be able to add the 3 books, delete any of the books
 (set it to null) and list all of the books (one by one). // add Book, delete Book, listBook
 Books are of two kinds: novels and art albums.  // Novel & ArtAlbum
 They both have a name and number of pages.    // book name, number of pages
 Novels have type (like mystery, sf, etc.) while albums have paper quality. // type, paper quality
 Model these entities (book, novel, album) with different classes and inheritance.

 Library: has 3 book
 Books: Novel & ArtAlbum
 Common and specific properties: bookName, numberOfPages // type & paperQuality
 Actions: add book, delete book, list all books <--- who does this?? Library

 This is a simple Library application for learning purposes. It can add, delete and list all the books contained in the
 @property List<Book> books.

 */
public class App 
{
    /**
     *
     * @param args
     */
    public static void main( String[] args )
    {

        Library myLibrary = new Library();

        Book firstBook = new Novel();
        firstBook.name = "First book";
        firstBook.numberOfPages = 100;
        ((Novel) firstBook).type = "scifi";

        Book secondBook = new ArtAlbum();
        secondBook.name = "Second book";
        secondBook.numberOfPages = 200;
        ((ArtAlbum) secondBook).paperQuality = "fine";


        Book thirdBook = new ArtAlbum();
        thirdBook.name = "Third book";
        thirdBook.numberOfPages = 300;
        ((ArtAlbum) thirdBook).paperQuality = "poor";

        myLibrary.addBook(firstBook);
        myLibrary.addBook(secondBook);
        myLibrary.addBook(thirdBook);

        myLibrary.listAllBooks();

        myLibrary.deleteBook(firstBook);
        myLibrary.deleteBook(secondBook);

        myLibrary.deleteBookByName("Third book");

        myLibrary.listAllBooks();

    }
}
