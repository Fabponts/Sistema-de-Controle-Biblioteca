package service;

import entities.Book;
import entities.BookStatus;
import entities.User;

import java.util.ArrayList;
import java.util.InputMismatchException;
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

        try {
            int howMany = howManyItems();
            scan.nextLine();

            for (int i = 0; i < howMany; i++) {
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
        } catch (InputMismatchException e) {
            System.out.println("Wrong type of data inserted");
            scan.nextLine();

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid status. Type: AVAILABLE,RESERVED,LOST");
        }
    }

    public void addUser() {

        try {
            int howMany = howManyItems();
            scan.nextLine();
            for (int i = 0; i < howMany; i++) {
                User user = new User();
                fileReaderService.readUserFile();

                user.setName(scan.nextLine());
                user.setRegisterNumber(scan.nextInt());
                scan.nextLine();

                fileWriterService.writeUserFile(user);
                users.add(user);

                System.out.println("User added successfully");
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong type of data inserted. ID must be a number");
            scan.nextLine();
        }
    }

    public int howManyItems() {
        System.out.println("How many will be added?");
        int number = 0;
        try {
            number = scan.nextInt();
            if (number <= 0) {
                System.out.println("Please write a number bigger than O");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number");
            scan.nextLine();
        }
        return number;
    }

    public void showAllBooks() {
        fileReaderService.printBookDataFile();
    }

    public void showAllUsers() {
        fileReaderService.printUserDataFile();
    }


}



