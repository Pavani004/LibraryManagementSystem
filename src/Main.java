import model.Book;
import service.LibraryService;
import utils.UIUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        // Sample data
        library.addBook("B001", "Java Programming", "James Gosling");
        library.addBook("B002", "Clean Code", "Robert Martin");
        library.addMember("M001", "Alice");

        while (true) {
            UIUtils.printHeader("Library Management System");
            System.out.println("1. 📚 Display Available Books");
            System.out.println("2. 📖 Borrow a Book");
            System.out.println("3. ❌ Exit");
            System.out.print("\n🔸 Choose an option: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    UIUtils.printHeader("Available Books");
                    library.displayBooks();
                    break;
                case "2":
                    UIUtils.printHeader("Borrow a Book");
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    String memberId = scanner.nextLine();
                    library.borrowBook(bookId, memberId);
                    break;
                case "3":
                    UIUtils.warningMessage("Exiting the system... Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    UIUtils.errorMessage("Invalid option! Please enter 1, 2, or 3.");
            }

            System.out.println(); // Add space between iterations
        }
    }
}
