package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {
    //todo criar leitores para ler os dados salvos nos arquivos book e user

    public void readBookFile() {
        String path = "F:\\projetosJava\\Sistema de Controle Biblioteca\\src\\questionaryBook.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void readUserFile() {
        String path = "F:\\projetosJava\\Sistema de Controle Biblioteca\\src\\questionaryUser.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
