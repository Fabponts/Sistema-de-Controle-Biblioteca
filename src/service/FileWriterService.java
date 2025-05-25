package service;

import entities.Book;
import entities.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService {

    public void writeBookFile(Book book){
        String path = "F:\\projetosJava\\Sistema de Controle Biblioteca\\bookFile.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true))){
            bufferedWriter.newLine();
            bufferedWriter.write("Book's title: " + book.getTitle() );
            bufferedWriter.newLine();
            bufferedWriter.write("Book's author: " + book.getAuthor() );
            bufferedWriter.newLine();
            bufferedWriter.write("Book's genre: " + book.getGenre() );
            bufferedWriter.newLine();
            bufferedWriter.write("Book's editor: " + book.getEditor() );
            bufferedWriter.newLine();
            bufferedWriter.write("Book's status: " + book.getStatus());
            bufferedWriter.newLine();
            bufferedWriter.write("-----------------------------------");

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void writeUserFile(User user){
        String path = "F:\\projetosJava\\Sistema de Controle Biblioteca\\userFile.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,true))){
            bufferedWriter.newLine();
            bufferedWriter.write("User' name: " + user.getName() );
            bufferedWriter.newLine();
            bufferedWriter.write("User's register number: " + user.getRegisterNumber());
            bufferedWriter.newLine();
            bufferedWriter.write("-----------------------------------");

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
