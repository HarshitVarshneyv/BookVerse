**📚 BookVerse – Online Book Management System**
---

**🔍 Overview**
BookVerse is a Spring Boot-based RESTful API project that enables admin users to manage a catalog of books while allowing general users to search and view them. It's a beginner-to-intermediate level project ideal for mastering CRUD operations, DTO patterns, validation, and clean architecture.

---

**🚀 Features**

* Add new books
* View all books
* Update book details (including partial updates)
* Delete books
* Filter books by title, author, or genre
* Input validation using Hibernate Validator
* Exception handling with custom exceptions
* Follows layered architecture: Controller, Service, Repository

---

**🧰 Tech Stack**

* Spring Boot
* Spring Data JPA
* Hibernate Validator
* H2 / MySQL
* Lombok (optional)
* Postman (for API testing)

---

**📦 Project Structure**

```
com.bookverse
├── controller
│   └── BookController.java
├── service
│   ├── BookService.java
│   └── BookServiceImpl.java
├── repository
│   └── BookRepository.java
├── model
│   └── Book.java
├── dto
│   └── BookDTO.java
│   └── BookUpdateDTO.java
├── exception
│   └── BookNotFoundException.java
│   └── GlobalExceptionHandler.java
└── BookverseApplication.java
```

---

**🔗 API Endpoints**

| Method | URL               | Description                    |
| ------ | ----------------- | ------------------------------ |
| POST   | /api/books        | Add a new book                 |
| GET    | /api/books        | Get all books                  |
| GET    | /api/books/{id}   | Get book by ID                 |
| PUT    | /api/books/{id}   | Update book                    |
| PATCH  | /api/books/{id}   | Partially update book          |
| DELETE | /api/books/{id}   | Delete book                    |
| GET    | /api/books/search | Filter by title, author, genre |

---

**🧪 How to Run the Project**

1. Clone the repository
2. Open in your IDE (e.g., IntelliJ, Eclipse)
3. Configure application.properties for H2/MySQL
4. Run `BookverseApplication.java`
5. Use Postman or Swagger UI to test endpoints

---

**🔮 Future Enhancements**

* Add user authentication and roles
* Integrate book ratings and reviews
* Pagination and sorting
* Swagger documentation

---

**👨‍💻 Author**
Harshit Varshney
---

---

**Happy Coding! 💻**
