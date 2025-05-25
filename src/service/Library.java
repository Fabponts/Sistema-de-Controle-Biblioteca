package service;

import entities.Book;
import entities.BookStatus;
import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner scan = new Scanner(System.in);
    FileReaderService fileReaderService = new FileReaderService();
    FileWriterService fileWriterService = new FileWriterService();

    private final List<Book> books = new ArrayList<>();
    private final List<User> users = new ArrayList<>();

    public Library() {
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook() {


        System.out.println("How Many Books will be added?");
        int howManyBooksToAdd = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < howManyBooksToAdd; i++) {
            Book book = new Book();
            fileReaderService.readBookFile();

            String title = scan.nextLine();
            book.setTitle(title);

            String author = scan.nextLine();
            book.setAuthor(author);

            String genre = scan.nextLine();
            book.setGenre(genre);

            String editor = scan.nextLine();
            book.setEditor(editor);

            book.setStatus(BookStatus.valueOf(scan.nextLine().toUpperCase()));
            books.add(book);
            fileWriterService.writeBookFile(book);
            System.out.println("Book added successfully");
        }
    }

    public void addUser() {
        System.out.println("How many users will be added?");
        int howManyUsers = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < howManyUsers; i++) {
            User user = new User();
            fileReaderService.readUserFile();

            user.setName(scan.nextLine());
            user.setRegisterNumber(scan.nextInt());
            scan.nextLine();

            fileWriterService.writeUserFile(user);
            users.add(user);

            System.out.println("User added successfully");
        }
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The list is empty");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showAllUsers() {
        if (users.isEmpty()) {
            System.out.println("The list is empty");
            return;
        }
        for (User user : users) {
            System.out.println(user);
        }
    }
}


