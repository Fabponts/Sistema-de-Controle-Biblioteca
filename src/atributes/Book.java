package atributes;

public class Book {
    // Atributos
    private String title;
    private String author;
    private boolean disponibility;

    //construtores
    public Book() {
        this.title = title;
        this.author = author;
        this.disponibility = disponibility;
    }

    //getters and setters;
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isDisponibility() {
        return disponibility;
    }
    //Metodos
    public String infos() {
        return "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "\n" + "Disponibility: " + isDisponibility();
    }
    public boolean toggleAvailability(){
        if (disponibility){
            disponibility = false;
            return true;
        }else{
            disponibility = true;
            return false;
        }
    }
}

