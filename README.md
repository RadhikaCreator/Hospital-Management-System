# Hospital Management System

A console-based Hospital Management System developed using **Java, JDBC, and MySQL**.

This project was created as my first Java project to practice Core Java, database connectivity, SQL queries, CRUD operations, and working with relational databases.

## Technologies Used

- Java
- JDBC
- MySQL
- SQL

## Features

- Add new patients
- View patient records
- View doctors
- Book appointments
- Check whether a patient and doctor exist before booking
- Check doctor availability for an appointment date
- Store hospital data in a MySQL database

## Database

The project uses three main tables:

- `patients`
- `doctors`
- `appointments`

The `appointments` table uses foreign keys to connect patients and doctors with their appointments.

## Project Structure

```text
Hospital-Management-System
│
├── src
│   └── Hospital_Management_system
│       ├── Hospital_managemet_system.java
│       ├── Patient.java
│       └── Doctor.java
│
├── database
│   ├── Creating Tables.sql
│   └── Inserting the Doct Data.sql
│
└── README.md
```

## How to Run

### 1. Set up MySQL

Create a MySQL database named:

```sql
hospital_management_system
```

### 2. Create the tables

Run:

```text
database/Creating Tables.sql
```

### 3. Add doctor data

Run:

```text
database/Inserting the Doct Data.sql
```

### 4. Configure the Java database connection

Update the MySQL username, password and port in:

```text
Hospital_managemet_system.java
```

Use your own MySQL credentials.

### 5. Run the Java application

Run:

```text
Hospital_managemet_system.java
```

## Main Menu

The application provides the following options:

```text
1. Add Patients
2. View Patients
3. View Doctors
4. Book Appointment
5. Exit
```

## What I Learned

Through this project, I practiced:

- Core Java
- Classes and objects
- Constructors
- Methods
- Exception handling
- JDBC
- PreparedStatement
- ResultSet
- SQL queries
- CRUD operations
- MySQL database connectivity
- Foreign keys and relational database concepts

## Future Improvements

- Add a graphical/web-based interface
- Add patient and doctor update/delete operations
- Add authentication
- Add more appointment management features
- Convert the backend to Spring Boot and REST APIs
