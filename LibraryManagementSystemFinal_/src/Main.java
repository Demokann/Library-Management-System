public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();
        system.start();
        system.scan.close();
    }
}