# <p align ="center">Library-Management-System</p>
<p>This project implements a library management system using Java and JQuarry, providing features for librarians and students to manage library resources effectively.</p>


# <h3>Key Functionalities:</h3>

- Librarian Management
<p>
  - Login Interface: Secure authentication for librarians using credentials.<br>
  - Add/Remove Librarian: Manage librarian accounts for system access.
</p>

- Student Management
<p>
  - Login Interface: Students can log in with their unique IDs for borrowing and returning books.<br>
  - Add/Remove Student: Register new students and update student records as needed.
</p>

- Book Management
<p>
  - Add New Book: Librarians can add book details (title, author, ISBN, etc.) to the library database.<br>
  - Borrow/Return Book: Students can search for books, borrow available titles, and return borrowed books with updates reflected in the database.<br>
  - Real-Time Table Updates: Changes made by librarians and students (adding new books, borrowing/returning) are dynamically reflected in a table for enhanced data visibility.
</p>
<hr>

# Example: Adding a New Student (Real-Time Update)

1. Librarian Interface: The librarian logs in and navigates to the student management section.
2. Student Registration: A form appears for entering student details (name, ID, contact information).
3. Data Submission: Upon submission, the Java code processes the data.
4. Database Update: The student data is sent to the database (potentially using JDBC connection) for permanent storage.
5. update the student table displayed to the librarian. The table would then show the newly added student information in real-time.

<hr>

# <h3>Sample Preview</h3>

<hr>

# <h4> Home Page Interface</h4>

<img src="Assets/Screenshot (8).png" width=700px/>

# <h4> Author Registration and Librarian Interface </h4>

<img src="Assets/Author.png" width=700px/>

# <h4> Borrower Interface</h4>

<img src="Assets/Barrow.png" width=700px/>
