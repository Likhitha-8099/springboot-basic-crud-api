# Spring Boot Student & Course REST API

A simple Spring Boot REST API project developed for practicing CRUD operations.

## Features

### Student APIs

- Get all students
- Get student by ID
- Add student
- Update student
- Delete student

### Course APIs

- Get all courses
- Get course by name
- Add course
- Update course
- Delete course

## Technologies Used

- Java 17
- Spring Boot
- Maven
- REST APIs

## API Endpoints

### Student

| Method | Endpoint |
|----------|----------|
| GET | /students |
| GET | /students/{id} |
| POST | /students |
| PUT | /students |
| DELETE | /students/{id} |

### Course

| Method | Endpoint |
|----------|----------|
| GET | /courses |
| GET | /courses/{courseName} |
| POST | /courses |
| PUT | /courses |
| DELETE | /courses/{courseName} |

## Project Structure

```text
com.telusko.students
├── controller
├── model
├── service
└── StudentsApplication
```

## Author

Likhitha
