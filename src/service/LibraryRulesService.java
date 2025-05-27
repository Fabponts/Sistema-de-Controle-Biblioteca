package service;

import entities.Book;
import entities.User;
import exception.BookException;
import exception.UserException;

public class LibraryRulesService {

    public void validateUserRule(User user) throws UserException {
        userNameRule(user);
        userIdRule(user);
    }

    public void validateBookRule(Book book) throws BookException{
        validateBookNameRule(book);
        validateBookAuthorRule(book);
        validateBookGenreRule(book);
    }

    public void userNameRule(User user) throws UserException {
        if (user.getName().isBlank()) {
            throw new UserException("You must insert an user name");
        }
        if (user.getName().trim().split(" ").length < 2){
            throw new UserException("The name must have a first and last name");
        }
        if(!user.getName().matches("[A-Za-zÀ-ÿ]+\\s+[A-Za-zÀ-ÿ]+")){
            throw new UserException("The user name must have letters between A and Z");
        }
    }

    public void userIdRule(User user) throws UserException {
        if (user.getRegisterNumber() == null) {
            throw new UserException("The id cannot be null");
        }
    }

    public void validateBookNameRule(Book book) throws BookException {
        if(book.getTitle().isBlank()){
            throw new BookException("You have to add a title");
        }
        if (!book.getTitle().matches("[A-Za-zÀ-ÿ]+\\s+[A-Za-zÀ-ÿ]+")){
            throw new BookException("The book's title must have letters between A and Z");
        }
    }

    public void validateBookAuthorRule(Book book) throws BookException {
        if (book.getAuthor().isBlank()) {
            throw new BookException("You must insert an author name");
        }
        if (book.getAuthor().trim().split(" ").length < 2){
            throw new BookException("The author's name should have a first and last name");
        }
        if (!book.getAuthor().matches("[A-Za-zÀ-ÿ]+\\s+[A-Za-zÀ-ÿ]+")){
            throw new BookException("The author's name must have letters between A and Z");
        }
    }

    public void validateBookGenreRule(Book book) throws BookException {
        if (book.getGenre().isBlank()) {
            throw new BookException("You must insert a book genre");
        }
        if (!book.getGenre().matches("[A-Za-zÀ-ÿ]+\\s+[A-Za-zÀ-ÿ]+")){
            throw new BookException("The book's genre must have letters between A and Z");
        }
    }

    public void validateBookEditorRule(Book book) throws BookException {
        if (book.getEditor().isBlank()) {
            throw new BookException("You must insert a book editor");
        }
        if (!book.getEditor().matches("[A-Za-zÀ-ÿ]+\\s+[A-Za-zÀ-ÿ]+")){
            throw new BookException("The book's editor must have letters between A and Z");
        }
    }
}
