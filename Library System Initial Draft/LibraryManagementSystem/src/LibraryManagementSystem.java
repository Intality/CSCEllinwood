import java.util.List;
import java.util.Scanner;
import java.time.LocalDate; //Receive the current date from the system

public class LibraryManagementSystem {

    public static void main(String[] args) {
        String filename = "library_data.ser"; // File name for saving and loading data
        Library library = Library.loadLibrary(filename); // Load library data from the file

        /* File save options:
        1. txt: exports nicely, but is not a good format for saving data.
        2. excel: saves data in a human-readable format, but is not a good format for saving data. Plus, it is
        beyond my current knowledge of how to export outside of the program.
        3. json: saves data in a human-readable format, but is not a good format for saving data. Never used it before.
        Therefore, I have no idea how to use it for this project.
        4. ser: saves data in a binary format, but is not human-readable. It is a good format for saving data,
        and is easy to add to the program. May be the best option for this project.

         */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Available Books");
            System.out.println("6. List Members");
            System.out.println("7. Display Overdue Books");
            System.out.println("8. View Member's Checked-Out Books");
            System.out.println("9. Save and Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    library.addMember(new Member(name));
                    break;

                case 3:
                    System.out.print("Enter member name: ");
                    String borrowerName = scanner.nextLine();
                    Member member = library.findMember(borrowerName);
                    if (member != null) {
                        System.out.print("Enter book title: ");
                        String bookTitle = scanner.nextLine();
                        Book book = library.findBook(bookTitle);
                        if (book != null) {
                            member.borrowBook(book);  // Sets a 14-day borrowing period in Member class
                            LocalDate dueDate = LocalDate.now().plusDays(14);
                            System.out.println(book.getTitle() + " is due on: " + dueDate);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter member name: ");
                    String returnerName = scanner.nextLine();
                    Member returningMember = library.findMember(returnerName);
                    if (returningMember != null) {
                        System.out.print("Enter book title: ");
                        String returnBookTitle = scanner.nextLine();
                        Book returnBook = library.findBook(returnBookTitle);
                        if (returnBook != null) {
                            returningMember.returnBook(returnBook);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 5:
                    library.listAvailableBooks();
                    break;

                case 6:
                    library.listMembers();
                    break;

                case 7:
                    List<Member> allMembers = library.getMembers();
                    if (allMembers.isEmpty()) {
                        System.out.println("No members to check for overdue books.");
                    } else {
                        for (Member m : allMembers) {
                            m.checkForOverdueBooks();
                        }
                    }
                    break;

                case 8:  // New option for viewing a member's checked-out books
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    Member targetMember = library.findMember(memberName);
                    if (targetMember != null) {
                        targetMember.viewCheckedOutBooks();
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 9:
                    library.saveLibrary(filename);
                    System.out.println("Exiting and saving data...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
