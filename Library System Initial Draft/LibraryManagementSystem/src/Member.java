import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Member implements Serializable {
    private String name;
    private List<Book> borrowedBooks;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < MAX_BORROW_LIMIT) {
            if (!book.isBorrowed()) {
                int days = 14;  // Set default borrowing period to 14 days
                book.borrowBook(days);
                borrowedBooks.add(book);
                System.out.println(name + " borrowed " + book.getTitle() + " for " + days + " days.");
            } else {
                System.out.println("The book is already borrowed.");
            }
        } else {
            System.out.println("Borrowing limit reached. Cannot borrow more books.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " has not borrowed this book.");
        }
    }

    public void viewCheckedOutBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no books checked out.");
        } else {
            System.out.println(name + "'s currently checked out books:");
            for (Book book : borrowedBooks) {
                String dueStatus = book.isOverdue() ? " (OVERDUE!)" : "";
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " - Due on: "
                        + book.getDueDate() + dueStatus);
            }
        }
    }

    public void checkForOverdueBooks() {
        for (Book book : borrowedBooks) {
            if (book.isOverdue()) {
                System.out.println("Overdue: " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
