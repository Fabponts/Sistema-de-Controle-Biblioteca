package program;

import service.LibrarySystemService;
import view.LibrarySystemMenu;

public class Main {
    public static void main(String[] args) {

        LibrarySystemService librarySystemService = new LibrarySystemService();

        librarySystemService.menuOperating();
    }
}