package program;

import service.LibrarySystemService;
import view.LibrarySystemMenu;

public class Main {
    public static void main(String[] args) {

        LibrarySystemMenu librarySystemMenu = new LibrarySystemMenu();
        LibrarySystemService librarySystemService = new LibrarySystemService();

        librarySystemMenu.showLibraryMenu();
        librarySystemService.menuOperating();
    }
}