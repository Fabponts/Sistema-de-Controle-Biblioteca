package program;
import entities.Book;
import service.Library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library();
        Integer n;

        System.out.println("-------Welcome to the library system-------");
        do {
            System.out.println("Type 1 to add a new book");
            System.out.println("Type 2 to add a new User");
            System.out.println("Type 3 to verify the user's list");
            System.out.println("Type 4 to verify the book's list");
            System.out.println("Type 5 to end the tasks");

            n = scan.nextInt();
            scan.nextLine();
                switch (n) {
                    case 1:
                        System.out.println("Type the Book's datas:");
                        library.addBook();
                        System.out.println("-----Book's data-----");

                        break;

                    case 2:
                        System.out.println("Type the new user's name:");
                        library.addUser();
                        System.out.println("-----User's data-----");

                        break;

                    case 3:
                        System.out.println("Verify the member's list:");
                        library.showAllUsers();
                        break;

                    case 4:
                        System.out.println("Verify the book's list: ");
                        library.showAllBooks();
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
            } while (n != 5) ;
            scan.close();
    }
}