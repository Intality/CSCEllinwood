import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " added to the library.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + " added as a library member.");
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("Available: " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println("Member: " + member.getName());
        }
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Member findMember(String name) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                return member;
            }
        }
        return null;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void saveLibrary(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
            System.out.println("Library data saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving library data: " + e.getMessage()); // Error handling
        }
    }

    public static Library loadLibrary(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Library) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading library data: " + e.getMessage());
            return new Library();  // Return a new Library object if loading fails
        }
    }
}
