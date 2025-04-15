package entities;

import java.util.Scanner;

public class Book {

    // Atributos
    private String title;
    private String author;
    private BookStatus status;
    Scanner scan = new Scanner(System.in);

    //construtores
    public Book(){
    }
    public Book(String title,String author, BookStatus status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    //getters and setters;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public BookStatus getStatus(){
        return status;
    }
    public void setStatus(){
        this.status = status;
    }
    //Metodos
    public String infos() {
        return "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "Status: " + getStatus() ;
    }

    }


