import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();
        ArrayList<String> borrowedBooks = new ArrayList<>();
        while (true) {
            System.out.println("\n Library Management System");
            System.out.println("1. Add Books");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Books");
            System.out.println("4. Return Books");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:// Adding the book
                    System.out.println("Enter the book name:");
                    String bookName = sc.nextLine();
                    books.add(bookName);
                    System.out.println("Book added:" + bookName);
                    break;
                case 2:// view books
                    System.out.println("Available Books");
                    if (books.isEmpty()) {
                        System.out.println("No books available");
                    } else {
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + "." + books.get(i));
                        }
                    }
                    break;
                case 3:// borrowing a book
                    System.out.println("Available books");
                    if (books.isEmpty()) {
                        System.out.println("No books available to borrow.");
                    } else {
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + "." + books.get(i));
                        }
                        System.out.println("Enter the book number you want to borrow");
                        int bookIndex = sc.nextInt()-1;
                        if (bookIndex >= 0 && bookIndex < books.size()) {
                            borrowedBooks.add(books.remove(bookIndex));
                            System.out.println("You borrowed the book.");
                        } else {
                            System.out.println("Invalid choice.");
                        }

                    }
                    break;
                case 4: // return book
                    System.out.println("Borrowed books.");
                    if (borrowedBooks.isEmpty()) {
                        System.out.println("No books to return.");
                    } else {
                        for (int i = 0; i < borrowedBooks.size(); i++) {
                            System.out.println((i + 1) + "." + borrowedBooks.get(i));
                        }
                        System.out.println("Enter the book number to return");
                        int returnIndex = sc.nextInt()-1;
                        if (returnIndex >= 0 && returnIndex < borrowedBooks.size()) {
                            books.add(borrowedBooks.remove(returnIndex));
                            System.out.println("You returned the book.");
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    }
                    break;
                case 5:// exit
                    System.out.println("Thank you for using my library management system\n@Garima Thapa");
                    return;
                default:
                    System.out.println("Invalid choice.Try again");
            }
        }
    }
}
