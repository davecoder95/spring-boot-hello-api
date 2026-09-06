# Spring Boot REST API

A simple REST API built with Java and Spring Boot as part of my Java backend development portfolio.

## Overview

This project demonstrates the fundamentals of building a RESTful web service using Spring Boot.

The application exposes a simple HTTP GET endpoint that returns a text response.

## Technologies

* Java
* Spring Boot
* Spring Web
* Maven
* Git
* GitHub

## API Endpoint

### GET `/hello`

Returns a simple greeting.

**Request:**

```text
GET /hello
```

**Response:**

```text
Hello World!
```

## Running the Application Locally

### Prerequisites

* Java JDK
* Maven (the project includes the Maven Wrapper)
* Git

### Start the application

On Windows:

```bash
.\mvnw.cmd spring-boot:run
```

The application runs on:

```text
http://localhost:8080
```

### Test the API

Open:

```text
http://localhost:8080/hello
```

Expected response:

```text
Hello World!
```

## Project Structure

```text
src/
└── main/
    ├── java/
    │   └── com/example/dave/demo/
    │       ├── DemoApplication.java
    │       └── HelloController.java
    └── resources/
        └── application.properties
```

## What I Learned

This project demonstrates:

* Creating a Spring Boot application
* Building a REST controller
* Mapping HTTP GET requests
* Running a Java web application locally
* Using Maven to build and run the application
* Using Git for source control
* Publishing a project to GitHub

## Future Improvements

Planned improvements include:

* Add additional REST endpoints
* Add request/response models
* Add validation
* Add unit and integration tests
* Add database persistence
* Deploy the application to AWS
* Add CI/CD using GitHub Actions

## Author

Dave

This project is part of my Java backend and cloud development portfolio.
