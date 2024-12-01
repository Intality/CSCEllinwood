GitHub link: https://github.com/Intality/CSCEllinwood/tree/main/LibraryManagementSystem-Final

# Library Management System (Shawn Ellinwood) - Final Draft

## Project Overview

The Library Management System is a Java program designed to manage a collection of books and library members. This final version demonstrates the core functionality, including managing multiple copies of books, generating unique member IDs, borrowing and returning books, and listing available books. The system manages overdue checks and ensures persistent data storage using serialization.

## Current State

The project currently includes the following primary classes and components:

1. **Book**: Manages details for each book, such as title, author, and availability status.
2. **BookCopy**: Each book can have multiple copies. This class manages individual copies of a book, including checkout codes, borrowed status, and due dates.
3. **Member**: Handles each library member’s information, including their borrowed books and unique member ID.
4. **Library**: Manages the collection of books and members, and provides methods for adding, finding, and listing books and members.
5. **LibraryManagementSystem**: The main class, responsible for interacting with the user via a command-line interface and executing library operations (such as adding books, members, and borrowing/returning books).

## Features Implemented

The program includes the following key features:

- **Book Management**:
  - Adding books with titles, authors, and multiple copies.
  - Each book copy has a unique checkout code.
  
- **Member Management**:
  - Adding members with a unique ID generated from the first three letters of their first name and a random four-character suffix.
  - Tracks borrowed books and manages due dates.

- **Borrowing and Returning Books**:
  - Members can borrow books by entering their ID and book title.
  - Books are assigned a due date and checkout code.
  - Members can return books by entering their checkout code.

- **Overdue Book Notifications**:
  - The system checks for overdue books and displays a list of them.
  
- **Data Persistence**:
  - The system saves and loads data using serialization to ensure persistent library and member data.
  
- **Menu System**:
  - A user-friendly menu system for performing operations such as adding books, adding members, borrowing books, returning books, and listing available books.

## Rationale for Choosing Serialization

Having worked with I/O projects before, I initially considered using a text file for data storage. While I was able to create and export text files, the data was not well-organized or easy to read outside of an IDE like IntelliJ. I also considered using Excel or a database but found the process confusing and beyond my current skill set, as I have no experience exporting data to Excel or working with SQL databases. Serialization proved to be the best choice, as it allowed me to save and load Java objects (like `Library`, `Book`, and `Member`) directly, preserving their structure without requiring complex formatting. This approach simplified data handling and fit the project’s current needs.

## Known Issues and Incomplete Parts

- **Library is Empty**: If the library is completely empty, some functions may throw errors or produce empty results. This is resolved once books or members are added and saved.
