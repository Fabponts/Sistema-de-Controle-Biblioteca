package service;

import view.LibrarySystemMenu;

import java.util.Scanner;

public class LibrarySystemService {
    Scanner scan = new Scanner(System.in);

    public void menuOperating() {
        Library library = new Library();
        switch (menuInteraction()) {
            case 1:
                System.out.println("Type the Book's datas:");
                library.addBook();
                break;

            case 2:
                System.out.println("Type the new user's name:");

                break;

            case 3:
                System.out.println("Verifying the member's list:");
                library.showAllUsers();
                break;

            case 4:
                System.out.println("Verifying the book's list: ");
                library.showAllBooks();
                break;

            case 5:

            case 6:

                break;

            case 7:
                System.out.println("Stopping the program");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid answer want to type again? y/n");
                String answer = scan.nextLine();
                if (answer.equals("n")) {
                    System.out.println("Stopping the program...");
                    System.exit(0);
                    break;
                }
        }
    }

    public int menuInteraction() {
        LibrarySystemMenu librarySystemMenu = new LibrarySystemMenu();
        int numberMenu;
        System.out.println("Choose an option: ");
        return numberMenu = scan.nextInt();
    }
}
