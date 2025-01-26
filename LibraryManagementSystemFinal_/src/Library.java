import java.util.ArrayList;
public class Library {
  final
  private ArrayList<Book> books = new ArrayList<>();

    //add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book \"" + book.getTitle() + "\" has been added to the library.");
    }
    //----------------------------------------------------------------------
    //silent add
    public void silentAddBook(Book book) {
        books.add(book);
    }
    //----------------------------------------------------------------------
    // check out a book
    public void checkOutBook(String title, Student student) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.checkOut(student); // Pass the student who is borrowing the book
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available in the library.");
        }
    }
    //----------------------------------------------------------------------
    //return a book
    public void returnBook(String title) {
        Book book = findBookByTitle(title); // Finds a book by its title
        if (book != null) {
            book.returnBook(); // Return the book
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available in the library.");
        }
    }
    //----------------------------------------------------------------------
    //display available books
    public void displayAvailableBooks() {
        System.out.println("Available books in the library:");
        boolean availableBooksExist = false;
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book); // Display books that are not checked out
                availableBooksExist = true;
            }
        }
        if (!availableBooksExist) {
            System.out.println("No available books in the library.");
        }
    }
    //----------------------------------------------------------------------
    //display checked-out books
    public void displayCheckedOutBooks() {
        System.out.println("Checked-out books:");
        boolean checkedOutBooksExist = false;
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println(book); // Display books that are checked out
                checkedOutBooksExist = true;
            }
        }
        if (!checkedOutBooksExist) {
            System.out.println("No checked-out books.");
        }
    }
    //----------------------------------------------------------------------
    //edit a book's title
    public void editBookTitle(String oldTitle, String newTitle) {
        Book book = findBookByTitle(oldTitle); // Finds a book by its old title
        if (book != null) {
            book.setTitle(newTitle); // Update the book's title
            System.out.println("The book title has been updated to '" + newTitle + "'.");
        } else {
            System.out.println("Sorry, the book '" + oldTitle + "' is not available in the library.");
        }
    }
    //----------------------------------------------------------------------
    //edit a book's author
    public void editBookAuthor(String oldTitle, String newAuthor) {
        Book book = findBookByTitle(oldTitle); // Finds a book by its old title
        if (book != null) {
            book.setAuthor(newAuthor); // Update the book's author
            System.out.println("The book author has been updated to '" + newAuthor + "'.");
        } else {
            System.out.println("Sorry, the book '" + oldTitle + "' is not available in the library.");
        }
    }

    // Helper method to find a book by its title
    private Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book; // Return the book if found
            }
        }
        return null; // Return null if the book is not found
}
}
