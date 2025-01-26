public class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;
    private Student borrowedBy; // New field to store the student who checked out the book

    //----------------------------------------------------------------------
    public Book(String title, String author) {
        this.author = author;
        this.title = title;
        this.isCheckedOut = false;
        this.borrowedBy = null; //No student has borrowed the book initially
    }

    //----------------------------------------------------------------------
    // Getter methods
    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    //----------------------------------------------------------------------
    // Setter methods
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //----------------------------------------------------------------------
    // Mark as checked out
    public void checkOut(Student student) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            borrowedBy = student;
            System.out.println("The book '" + title + "' has been checked out by " + student.getFirstName() + " " + student.getLastName() + " (ID: " + student.getStudentId() + ").");
        } else {
            System.out.println("Sorry, the book '" + title + "' is already checked out.");
        }
    }

    //----------------------------------------------------------------------
    // Mark as returned
    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            borrowedBy = null; // Reset the student who borrowed the book
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' was not checked out.");
        }
    }

    //----------------------------------------------------------------------
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Status: " + (isCheckedOut ? "Not Available, Borrowed by: " + borrowedBy.getFirstName() + " " + borrowedBy.getLastName() : "Available");
    }
}
