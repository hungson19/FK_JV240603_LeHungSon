CREATE DATABASE quanlythuvien;
USE quanlythuvien;

CREATE TABLE BookType (
                          TypeId INT PRIMARY KEY AUTO_INCREMENT,
                          TypeName VARCHAR(50) NOT NULL UNIQUE,
                          Description TEXT,
                          IsDeleted BIT DEFAULT 0
);

CREATE TABLE Book (
                      BookId INT PRIMARY KEY AUTO_INCREMENT,
                      BookName VARCHAR(100) NOT NULL UNIQUE,
                      Title VARCHAR(200) NOT NULL,
                      Author VARCHAR(200) NOT NULL,
                      TotalPages INT NOT NULL CHECK (TotalPages > 0),
                      Content TEXT NOT NULL,
                      Publisher VARCHAR(100) NOT NULL,
                      Price DECIMAL(10,2) NOT NULL CHECK (Price > 0),
                      TypeId INT NOT NULL,
                      IsDeleted BIT DEFAULT 0,
                      FOREIGN KEY (TypeId) REFERENCES BookType(TypeId)
);
