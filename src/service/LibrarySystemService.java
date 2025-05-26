package service;


import view.LibrarySystemMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrarySystemService {
    Scanner scan = new Scanner(System.in);

    public void menuOperating() {
        Library library = new Library();
        LibrarySystemMenu librarySystemMenu = new LibrarySystemMenu();

        int option;
        do {
            librarySystemMenu.showLibraryMenu();
            option = menuInteraction();

            switch (option) {
                case 1:
                    library.addBook();
                    break;

                case 2:
                    library.addUser();
                    break;

                case 3:
                    System.out.println("Printing all members:");
                    library.showAllUsers();
                    break;

                case 4:
                    System.out.println("Printing all books: ");
                    library.showAllBooks();
                    break;

                case 5:
                    System.out.println("Search for a book:");
                    break;
                case 6:
                    System.out.println("Search for a user");
                    break;

                case 7:
                    System.out.println("Stopping the program");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 7);
    }

    public int menuInteraction() {
        System.out.print("Choose an option: ");
        int option = 0;

        try {
            option = scan.nextInt();

           if (option <= 0 || option > 7){
               System.out.println("Type a valid option between 1 and 7");
           }
       }
        catch (InputMismatchException e){
            System.out.println("Please choose a number");
            scan.nextLine();
        }
        return option;
    }
}
