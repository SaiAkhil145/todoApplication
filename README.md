# Todo Application
## Language and Framework

![Java](https://img.shields.io/badge/Language-Java-green)
![Spring Boot](https://img.shields.io/badge/Framework-Spring%20Boot-brightgreen)

## Description

The Todo Application is a Spring Boot-based web application designed to help manage todo task information. It allows users to perform various operations related to task management, including adding new todos and status of todo, updating todo, and deleting todo from the system.

## Project Structure

The project is organized into several parts, each serving a specific purpose:

### 1. Configuration

In this section, you'll find the configuration class for the database. Note that in this project, we're using a MySQL database, with todoIds as Primary keys.

### 2. Entities

This section contains the `Todo` class, which represents the core entity of the system. The `Todo` class includes the following properties:

- `todoId` (Integer): Unique identifier for each user.
- `todoName` (String): todo's name.
- `todoStatus` (boolean): todo's status.


### 3. Repository

In this section, you'll find the interface responsible for interacting with the database (MySQL) and performing CRUD (Create, Read, Update, Delete) operations on user data.

### 4. Services

The Services section includes a set of service classes that the API Controller class uses to handle todo Application. The list of services includes:

- `addTodo`: Adds a new todo to the system.
- `getTodo`: Retrieves todo information by todo ID.
- `getAllTodos`: Retrieves a list of all todos in the system.
- `updateTodoById`: Updates todo status, allowing for changes to todo status.
- `deleteTodo`: Deletes a todo by todo ID.
- `getTodos` "retrieves a list of todos in the system.

### 5. Controller

This section houses the `APIController` class, which provides API endpoints for interacting with the todo Application. Here is a list of available endpoints:

- `POST /Todo`: Adds a new todo. Accepts a todo object in the request body.
- `GET /todo/{id}/id`: Retrieves todo information by todo ID.
- `GET /get/todos`: Retrieves a list of all users.
- `PUT /update/Todo/{newId}/{status}/status`: Updates todo status. Accepts todo ID and optional parameter for status 
- `DELETE /todo/{id}/id`: Deletes a todo by todo ID.

note: for further understanding you can use Swagger Ui at http://localhost:8080/swagger-ui/index.html# if your running the app in localHost
## Data Flow
As soon as user hit any API the Controller handle it and Call the respective service, In Services section the buisness logic is applied and if the data base interaction required it hit the repository section. In repository section the data base interation take place

## Database Scema
Todo{
todoId*	integer($int32)
todoName*	string
todoStatus*     boolean     
}

## Getting Started

To get started with the todo Management System, follow the instructions in the [Installation](#installation) section below.

### Prerequisites

Make sure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Maven
- Spring Boot Dependecy

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/SaiAkhil145/todoApplication
   
2. Navigate to the project directory

    ```bash
    cd todoApplication

## Usage

To use the User Management app, you can make HTTP requests to the provided API endpoints using your favorite API testing tool or framework.
