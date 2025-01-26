import java.util.Scanner;

public class LibraryManagementSystem {
    public static final String PASSWORD = "admin123";
    final Library library = new Library();
    final Scanner scan = new Scanner(System.in);

    //----------------------------------------------------------------------
    public LibraryManagementSystem() {
        initializeLibrary();
    }

    //----------------------------------------------------------------------
    public void start() {
        if (checkPassword() == 0) {
            int choice;
            do {
                System.out.println("\n1. Add a book");
                System.out.println("2. Check out a book");
                System.out.println("3. Return a book");
                System.out.println("4. Display available books");
                System.out.println("5. Display checked-out books");
                System.out.println("6. Edit a book");
                System.out.println("7. Exit");

                System.out.print("Enter your selection: ");
                choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        // Add a book
                        System.out.print("Enter book title: ");
                        String title = scan.nextLine();
                        System.out.print("Enter book author: ");
                        String author = scan.nextLine();
                        Book book = new Book(title, author);
                        library.addBook(book);
                        break;

                    case 2:
                        // Check out a book
                        System.out.print("Enter book title to check out: ");
                        String checkOutTitle = scan.nextLine();
                        System.out.print("Enter student name: ");
                        String studentFirstName = scan.nextLine();
                        System.out.print("Enter student surname: ");
                        String studentLastName = scan.nextLine();
                        System.out.print("Enter student ID: ");
                        String studentId = scan.nextLine();

                        Student student = new Student(studentFirstName, studentLastName, studentId);
                        library.checkOutBook(checkOutTitle, student);
                        break;

                    case 3:
                        // Return a book
                        System.out.print("Enter book title to return: ");
                        String returnTitle = scan.nextLine();
                        library.returnBook(returnTitle);

                        break;
                    case 4:
                        // Display available books
                        library.displayAvailableBooks();
                        break;

                    case 5:
                        // Display checked-out books
                        library.displayCheckedOutBooks();
                        break;

                    case 6:
                        // Edit a book
                        System.out.print("Enter the title of the book to edit: ");
                        String oldTitle = scan.nextLine();
                        System.out.println("Choose the detail to edit:");
                        System.out.println("1. Title");
                        System.out.println("2. Author");
                        int editChoice = scan.nextInt();
                        scan.nextLine();

                        if (editChoice == 1) {
                            System.out.print("Enter new title: ");
                            String newTitle = scan.nextLine();
                            library.editBookTitle(oldTitle, newTitle);
                        } else if (editChoice == 2) {
                            System.out.print("Enter new author: ");
                            String newAuthor = scan.nextLine();
                            library.editBookAuthor(oldTitle, newAuthor);
                        } else {
                            System.out.println("Invalid option, please try again.");
                        }
                        break;

                    case 7:
                        System.out.println("Thank you for using the Library Management System.");
                        break;

                    default:
                        System.out.println("Invalid option, please try again.");
                        break;
                }
            } while (choice != 7);
        }
    }

    //----------------------------------------------------------------------
    public int checkPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        for (int i = 3; i > 0; i--) {
            System.out.println("Enter the password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(PASSWORD)) {
                System.out.println("Logged in successfully.");
                return 0;
            } else {
                System.out.println("Wrong password, you have " + (i - 1) + " attempts left.");
            }
        }
        scanner.close();
        return 1;
    }

    //----------------------------------------------------------------------
    private void initializeLibrary() {
        library.silentAddBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.silentAddBook(new Book("1984", "George Orwell"));
        library.silentAddBook(new Book("Pride and Prejudice", "Jane Austen"));
        library.silentAddBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.silentAddBook(new Book("War and Peace", "Leo Tolstoy"));
        library.silentAddBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        library.silentAddBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.silentAddBook(new Book("Ulysses", "James Joyce"));
        library.silentAddBook(new Book("The Odyssey", "Homer"));
    }
}
