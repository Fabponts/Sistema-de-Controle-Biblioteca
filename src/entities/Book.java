package entities;

public class Book {

    private String title;
    private String author;
    private String genre;
    private String editor;
    private BookStatus status;

    public Book(){
    }
    public Book(String title,String author,String genre,String editor, BookStatus status) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.editor = editor;
        this.status = status;
    }

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Book title: ").append(getTitle()).append("/n");
        stringBuilder.append("Book author: ").append(getAuthor()).append("/n");
        stringBuilder.append("Book genre: ").append(getGenre()).append("/n");
        stringBuilder.append("Book editor: ").append(getEditor()).append("/n");
        stringBuilder.append("Book status: ").append(getStatus()).append("/n");
        return stringBuilder.toString();
    }
}


