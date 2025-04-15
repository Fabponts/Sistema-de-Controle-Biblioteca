package service;
import entities.Book;
import entities.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library  {
    Scanner scan = new Scanner(System.in);
    Book book = new Book();
    //Arrays
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();


    //Constructors
    public Library(){
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    //Methods
    //MethodsToAdd
    public void addBook(){
        books.add(book);
        System.out.println("Add a title: ");
        book.setTitle(scan.nextLine());
        System.out.println("Title: " + book.getTitle());;

        System.out.println("Add the Author: ");
        book.setAuthor(scan.nextLine());
        System.out.println("Author:" + book.getAuthor());

        System.out.println("Status" + book.getStatus());
    }
    //Methods to show
    public void showAllBooks(){
        for(Book book : books){
            System.out.println(books);
        }
    }
    public void showAllUsers(){
        for(User user : users){
            System.out.println(users);
        }
    }
}


