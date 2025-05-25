package view;

public class LibrarySystemMenu {
    StringBuilder stringBuilderMenu = new StringBuilder();
    public void showLibraryMenu() {
        stringBuilderMenu.append("-------Welcome to the library system-------\n");
        stringBuilderMenu.append("Type 1 to add a new book\n");
        stringBuilderMenu.append("Type 2 to add a new User\n");
        stringBuilderMenu.append("Type 3 to print the user list\n");
        stringBuilderMenu.append("Type 4 to print the book listk\n");
        stringBuilderMenu.append("Type 5 to search a book\n");
        stringBuilderMenu.append("Type 6 to search an user\n");
        stringBuilderMenu.append("Type 7 to exit the program\n");

        System.out.println(stringBuilderMenu);
    }
}
