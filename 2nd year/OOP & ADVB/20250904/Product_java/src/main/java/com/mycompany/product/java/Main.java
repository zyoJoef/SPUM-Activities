package com.mycompany.product.java;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Product Management System ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter product type: ");
                    String type = scanner.nextLine();

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    Product newProduct = new Product(name, type, Date.valueOf(LocalDate.now()), quantity);
                    dao.addProduct(newProduct);
                    break;

                case 2:
                    List<Product> products = dao.getAllProducts();
                    System.out.println("\n--- Product List ---");
                    for (Product p : products) {
                        System.out.printf("ID: %d, Name: %s, Type: %s, Date Added: %s, Quantity: %d%n",
                                p.getProductId(), p.getName(), p.getType(), p.getDateAdded(), p.getQuantity());
                    }
                    break;

                case 3:
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new type: ");
                    String newType = scanner.nextLine();

                    System.out.print("Enter new quantity: ");
                    int newQty = scanner.nextInt();

                    Product updatedProduct = new Product(updateId, newName, newType, Date.valueOf(LocalDate.now()), newQty);
                    dao.updateProduct(updatedProduct);
                    break;

                case 4:
                    System.out.print("Enter product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    dao.deleteProduct(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
