# Spring Boot REST API

A REST API built with Java and Spring Boot as part of my Java backend development portfolio.

## Overview

This project demonstrates the fundamentals of building a RESTful web service using Spring Boot.

The application provides a Product API with CRUD operations for creating, retrieving, updating, and deleting products.

The project currently stores product data in memory using a Java `ArrayList`. Database persistence will be added in a future phase.

## Technologies

* Java

* Spring Boot

* Spring Web

* Maven

* REST API

* DTOs

* Git

* GitHub

## API Endpoints

### GET `/products`

Returns all products.

**Request:**

```text
GET /products
```

**Example response:**

```json
[
  {
    "id": 1,
    "name": "Laptop",
    "price": 999.99
  },
  {
    "id": 2,
    "name": "Keyboard",
    "price": 79.99
  }
]
```

### GET `/products/{id}`

Returns a product by ID.

**Request:**

```text
GET /products/1
```

### POST `/products`

Creates a new product.

**Request:**

```text
POST /products
```

**Request body:**

```json
{
  "name": "Monitor",
  "price": 299.99
}
```

The server automatically generates the product ID.

**Response:**

```json
{
  "id": 4,
  "name": "Monitor",
  "price": 299.99
}
```

### PUT `/products/{id}`

Updates an existing product.

**Request:**

```text
PUT /products/1
```

**Request body:**

```json
{
  "name": "Gaming Laptop",
  "price": 1299.99
}
```

### DELETE `/products/{id}`

Deletes a product by ID.

**Request:**

```text
DELETE /products/1
```

## HTTP Status Codes

The API currently uses standard HTTP status codes:

| Operation         | Status        |
| ----------------- | ------------- |
| GET               | 200 OK        |
| POST              | 201 Created   |
| PUT               | 200 OK        |
| DELETE            | 200 OK        |
| Product not found | 404 Not Found |

## DTOs

The API uses Data Transfer Objects (DTOs) to separate API requests and responses from the internal Product model.

### ProductRequest

Used when creating or updating a product.

```json
{
  "name": "Keyboard",
  "price": 79.99
}
```

The client does not provide the product ID.

### ProductResponse

Used when returning product information to the client.

```json
{
  "id": 1,
  "name": "Keyboard",
  "price": 79.99
}
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

For example:

```text
GET http://localhost:8080/products
```

The API can be tested using PowerShell, Postman, or another API client.

## Project Structure

```text
src/
└── main/
    ├── java/
    │   └── com/example/dave/demo/
    │       ├── DemoApplication.java
    │       ├── controller/
    │       │   └── ProductController.java
    │       ├── service/
    │       │   └── ProductService.java
    │       ├── model/
    │       │   └── Product.java
    │       └── dto/
    │           ├── ProductRequest.java
    │           └── ProductResponse.java
    └── resources/
        └── application.properties
```

## Current Data Storage

Products are currently stored in memory using a Java `ArrayList`.

The initial products are:

```text
1 - Laptop - 999.99
2 - Keyboard - 79.99
3 - Mouse - 39.99
```

Because the data is stored in memory, all products are lost when the application restarts.

## What I Learned

This project demonstrates:

* Creating a Spring Boot application

* Building REST controllers

* Mapping HTTP GET, POST, PUT, and DELETE requests

* Working with HTTP status codes

* Creating a service layer

* Separating application layers

* Using DTOs for API requests and responses

* Generating IDs on the server

* Handling resources that are not found

* Running a Java web application locally

* Using Maven to build and run the application

* Using Git for source control

* Publishing a project to GitHub

## Future Improvements

Planned improvements include:

* Add database persistence using PostgreSQL

* Add Spring Data JPA and Hibernate

* Replace in-memory storage with a database repository

* Add request validation

* Add global exception handling

* Add consistent API response structures

* Add unit and integration tests

* Add API documentation using Swagger/OpenAPI

* Deploy the application to AWS

* Add CI/CD using GitHub Actions

## Author

Dave

This project is part of my Java backend and cloud development portfolio.
