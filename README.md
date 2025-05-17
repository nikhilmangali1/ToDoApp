

# ✅ ToDoApp

A full-stack **Spring Boot** web application for managing tasks in a To-Do list. This project follows a layered architecture using Spring MVC, Spring Data JPA, and Thymeleaf for rendering HTML templates.

## 🌟 Features

* Add, view, and manage tasks
* Spring MVC controller structure
* Thymeleaf HTML templates (`welcome.html`, `allTasks.html`)
* Data persistence using Spring Data JPA
* Maven project with a Spring Boot setup
* Organized in a clean, modular architecture

## 🗂 Project Structure

```
ToDoApp/
├── src/
│   ├── main/
│   │   ├── java/com/app/ToDoApp/
│   │   │   ├── controller/TaskController.java
│   │   │   ├── model/Task.java
│   │   │   ├── repository/TaskRepository.java
│   │   │   ├── service/TaskService.java
│   │   │   └── ToDoAppApplication.java
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── welcome.html
│   │       │   └── allTasks.html
│   │       └── application.properties
│   └── test/
│       └── java/com/app/ToDoApp/ToDoAppApplicationTests.java
├── pom.xml
├── mvnw / mvnw.cmd
└── HELP.md
```

## 🚀 Getting Started

### Prerequisites

* Java 17+
* Maven 3+

### Run the application

```bash
./mvnw spring-boot:run
```

Then open your browser at:
`http://localhost:8080`

## 🖼 User Interface

* **`welcome.html`**: Landing page
* **`allTasks.html`**: Displays a list of all tasks


## 💡 Technologies Used

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* H2 Database (or configurable DB)
* Maven


