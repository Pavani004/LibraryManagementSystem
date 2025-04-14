package service;

import model.Book;
import model.Library;
import model.Member;
import utils.FileUtils;

public class LibraryService {
    private Library library;

    public LibraryService() {
        this.library = new Library();
    }

    public void addBook(String id, String title, String author) {
        library.addBook(new Book(id, title, author));
    }

    public void addMember(String id, String name) {
        library.addMember(new Member(id, name));
    }

    public void displayBooks() {
        System.out.println("\nAvailable Books:");
        for (Book book : library.getBooks()) {
            if (book.isAvailable()) {
                System.out.println(book.getId() + " | " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void borrowBook(String bookId, String memberId) {
        for (Book book : library.getBooks()) {
            if (book.getId().equals(bookId) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Book is not available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}