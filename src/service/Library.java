package service;

import entities.Book;
import entities.BookStatus;
import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner scan = new Scanner(System.in);

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
        Book book = new Book();

        System.out.println("How Many Books will be added?");
        int howManyBooksToAdd = scan.nextInt();

        for (int i = 0; i < howManyBooksToAdd; i++) {

            System.out.println("Add a title: ");
            book.setTitle(scan.nextLine());
            System.out.println("Title: " + book.getTitle());

            System.out.println("Add the Author: ");
            book.setAuthor(scan.nextLine());
            System.out.println("Author:" + book.getAuthor());

            System.out.println("Add the disponibility (AVAILABLE/UNAVAILABLE/RESERVED):");
            System.out.println("Status: " + BookStatus.valueOf(scan.nextLine().toUpperCase()));

            books.add(book);
            System.out.println("Book added successfully");
        }
    }

    public void addUser() {
        User user = new User();
        System.out.println("How many users will be added?");
        int howManyUsers = scan.nextInt();
        for (int i = 0; i < howManyUsers; i++) {

            System.out.println("Add a name: ");
            user.setName(scan.nextLine());
            System.out.println("Name: " + user.getName());

            System.out.println("Add the Register Number: ");
            user.setRegisterNumber(scan.nextInt());
            scan.nextLine();
            System.out.println("Register Number:" + user.getRegisterNumber());

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
            System.out.println(book.toString());
        }
    }

    public void showAllUsers() {
        if (users.isEmpty()) {
            System.out.println("The list is empty");
            return;
        }
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}


