# Quiz 1 OOP

Develop a Java console application using JDBC that allows users to perform CRUD (Create, Read, Update, Delete) operations on a MySQL product table.

Given table:
CREATE TABLE product (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    type VARCHAR(100),
    date_added DATE,
    quantity INT
);
Requirements:

Use Java OOP principles:
-A Product class for modeling product data.
-A class to manage database operations (Create, Read, Update, Delete).
-A Main class to handle console I/O using the Scanner class.
-Use JDBC to connect to a MySQL database.


Implement the following CRUD operations:

Add new product
-View all products
-Update a product by ID
-Delete a product by ID


Sample Run:
=== Product Management System ===
1. Add Product
2. View Products
3. Update Product
4. Delete Product
5. Exit
Enter choice: 1

Enter product name: Keyboard
Enter product type: Electronics
Enter quantity: 50
Product added successfully!

=== Product Management System ===
1. Add Product
2. View Products
3. Update Product
4. Delete Product
5. Exit
Enter choice: 2

--- Product List ---
ID: 1, Name: Keyboard, Type: Electronics, Date Added: 2025-09-04, Quantity: 50

=== Product Management System ===
Enter choice: 3
Enter product ID to update: 1
Enter new name: Mechanical Keyboard
Enter new type: Electronics
Enter new quantity: 60
Product updated successfully!

=== Product Management System ===
Enter choice: 4
Enter product ID to delete: 1
Product deleted successfully!

=== Product Management System ===
Enter choice: 5
Exiting...
