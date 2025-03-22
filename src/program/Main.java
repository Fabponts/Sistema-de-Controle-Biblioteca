package program;
import atributes.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User();

        System.out.println("Welcome to our Library, to access tap your name and your register number");

        System.out.print("Name: ");
        String name = scan.nextLine();
        user.setName(name);

        System.out.print("Register Number: ");
        int registerNumber = scan.nextInt();
        user.setRegisterNumber(registerNumber);

        System.out.println(user);
        System.out.println("Would you like to see our book's options? s/n");


    }
}