package service;


import view.LibrarySystemMenu;

import java.util.Scanner;

public class LibrarySystemService {
    Scanner scan = new Scanner(System.in);
    //todo: Corrigir o erro de aumento do numeros de menu
    public void menuOperating() {
        Library library = new Library();
        LibrarySystemMenu librarySystemMenu = new LibrarySystemMenu();

        int option;
        do {
            librarySystemMenu.showLibraryMenu();
            option = menuInteraction();

            switch (option) {
                case 1:
                    System.out.println("Type the Book's datas:");
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
                    System.out.println("Invalid answer want to type again? y/n");
                    scan.nextLine();
            }
        } while (option != 7);
    }

    public int menuInteraction() {
        System.out.print("Choose an option: ");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scan.next();
        }
        int option = scan.nextInt();
        scan.nextLine();
        return option;
    }
}
