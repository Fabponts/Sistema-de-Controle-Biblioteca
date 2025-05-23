package service;

import view.LibrarySystemMenu;

import java.util.Scanner;

public class LibrarySystemService {
    Scanner scan = new Scanner(System.in);

    public void menuOperating() {
        switch (menuInteraction()) {
            case 1:
                System.out.println("Type the Book's datas:");
                break;

            case 2:
                System.out.println("Type the new user's name:");

                break;

            case 3:
                System.out.println("Verify the member's list:");

                break;

            case 4:
                System.out.println("Verify the book's list: ");
                break;

            case 5:
                System.out.println("Stopping the program");
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
