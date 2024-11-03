import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    private String title;
    private String author;
    private boolean isBorrowed;
    private LocalDate dueDate;  // New field for due date

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void borrowBook(int days) {
        if (!isBorrowed) {
            isBorrowed = true;
            dueDate = LocalDate.now().plusDays(days);  // Set due date based on borrowing period
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            dueDate = null;  // Clear due date upon return
        } else {
            System.out.println("Book is not borrowed.");
        }
    }

    public boolean isOverdue() {
        return isBorrowed && LocalDate.now().isAfter(dueDate);
        // Check if the book is overdue
    }
}
