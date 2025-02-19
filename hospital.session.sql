CREATE DATABASE hospital_db;
USE hospital_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100),
    role ENUM('admin', 'doctor', 'patient')
);

CREATE TABLE doctors (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    specialization VARCHAR(100)
);

CREATE TABLE appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_name VARCHAR(100),
    doctor_id INT,
    appointment_date DATE,
    status ENUM('Pending', 'Completed'),
    FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);
show tables;
select * from appointments;
show tables;
select *from doctors;