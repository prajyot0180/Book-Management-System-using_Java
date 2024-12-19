# Book-Management-System
A web-based application built using Spring Boot (backend) and HTML/CSS/JavaScript (frontend), designed to manage a collection of books. This application allows authenticated admins to add, update, and delete books while providing an organized interface for users to browse and sort the available books.

<br><h2>Features</h2>
<h3>Admin Functionalities : </h3><br>
- Add new books to the collection.
- Update existing book details like title, author, genre, and price.
- Delete books securely.
<h3>User Features : </h3><br>
- View all books in an organized block format.
- Sort books by price, rating, or genre dynamically.
<h3>Security : </h3><br>
- Only authorized admin can modify the book collection.
<h3>Integration : </h3><br>
- Frontend communicates with the backend via RESTful APIs.
- JSON is used for data exchange between the client and the server.

<br><h2>Tech Stack</h2>
<h3>Backend : </h3><br>
- Spring Boot : REST API development.
- Spring Data JPA : For seamless database operations.
- MySQL : Database for storing book records.
- Maven : For project management and dependency resolution.
<h3>Frontend : </h3><br>
- HTML & CSS : User interface design and styling.
- JavaScript : Dynamic functionality for user interactions and API integration.

<br><h2>How to Run</h2>
<h3>Prerequisites : </h3><br>
- Java 17 or above installed.
- MySQL database set up and running.
- Maven installed for building the backend.
<h3>Steps : </h3><br>
1. Clone the Repository :  git clone https://github.com/your-username/book-management-system.git
cd book-management-system

2. Setup Backend :
- Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
- Configure the application.properties file with your database credentials :
  
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
  
spring.datasource.username=root

spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update

- Run the BookManagementSystemApplication class to start the Spring Boot server.
<h3>Run the Frontend : </h3><br>
- Open the index.html file in your browser to access the user interface.
- Navigate to admin.html for admin functionalities.
<h3>Access Admin Panel : </h3><br>
- Use predefined admin credentials for authentication and book management.

<br><h2>Folder Structure</h2><br>
book-management-system
-├── src/
-│   ├── main/
-│   │   ├── java/com/example/bookmanagement/  # Spring Boot backend code
-│   │   └── resources/
-│   │       ├── application.properties       # Database configuration
-│   │       └── static/                      # HTML, CSS, JavaScript files
-├── pom.xml                                  # Maven configuration

<br><h2>Future Enhancements</h2>
- Add book reviews and ratings.
- Introduce user roles and registration for customers.
- Enhance UI/UX using a responsive design framework like Bootstrap.
