CREATE DATABASE IF NOT EXISTS student_management_system;
USE student_management_system;
CREATE TABLE IF NOT EXISTS students (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    course VARCHAR(120) NOT NULL,
    phone VARCHAR(10) NOT NULL,
    city VARCHAR(100) NOT NULL
);
