CREATE DATABASE portfolio_db;

USE portfolio_db;

CREATE TABLE contacts(

id INT AUTO_INCREMENT PRIMARY KEY,

firstname VARCHAR(50),

lastname VARCHAR(50),

email VARCHAR(100),

subject VARCHAR(255),

message TEXT,

created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);