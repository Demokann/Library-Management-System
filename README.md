Library Management System
Overview
The Library Management System is a Java-based application that helps manage books, students, and the process of checking out and returning books. It provides an easy-to-use interface for library staff to handle common operations such as adding books, checking out books, returning books, and displaying available or checked-out books.

Features
Add a book: Allows adding new books with their title and author.
Check out a book: Enables students to check out books, assigning them to the student based on their ID.
Return a book: Allows students to return books they have checked out.
Display available books: Lists all books that are currently available for borrowing.
Display checked-out books: Displays books that are currently checked out.
Edit book details: Modify book titles or authors.
Password authentication: Ensures only authorized users can access the system by requiring a password.

Technologies Used
Java: The main programming language used.
Scanner: For handling user input in the console.

Structure and Class Relationships
The system is composed of multiple classes that work together:
Main: The entry point of the application, where the LibraryManagementSystem is initiated and executed.
LibraryManagementSystem: The core logic of the system that handles user interaction and performs various library operations (such as adding books, checking out books, etc.). It includes a password check for security.
Library: Stores and manages the list of books. It provides methods to add, edit, check out, return, and display books.
Book: Represents a book in the library with properties such as title, author, and availability status. It also tracks which student has borrowed the book.
Student: Represents a student who borrows books. It includes basic student information such as first name, last name, and student ID.

Class Diagram Overview
LibraryManagementSystem: interacts with the Library class to manage books.
Library: holds a collection of Book objects.
Book: interacts with Student to track which student has borrowed the book.
Main: calls LibraryManagementSystem to start the application.

Installation
Clone the repository:
git clone https://github.com/your-username/Library-Management-System.git

Set up Java: Ensure you have the Java Development Kit (JDK) installed on your system.

Run the program:

Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
Run the Main class to start the Library Management System.
You will be prompted to enter a password (default password: admin123).
After logging in, interact with the system through the console by selecting different operations from the menu.

Welcome!
Enter the password: admin123
Logged in successfully.

1. Add a book
2. Check out a book
3. Return a book
4. Display available books
5. Display checked-out books
6. Edit a book
7. Exit
Enter your selection: 1
Enter book title: The Catcher in the Rye
Enter book author: J.D. Salinger
The book "The Catcher in the Rye" has been added to the library.
