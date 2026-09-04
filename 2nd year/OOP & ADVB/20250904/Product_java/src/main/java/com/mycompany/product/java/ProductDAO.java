package com.mycompany.product.java;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/product?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }


    public void addProduct(Product product) {
        String sql = "INSERT INTO product (name, type, date_added, quantity) VALUES (?, ?, ?, ?)";

        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getType());
            stmt.setDate(3, product.getDateAdded());
            stmt.setInt(4, product.getQuantity());
            stmt.executeUpdate();
            System.out.println("Product added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM product";

        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt("product_id"),
                        rs.getString("name"),
                        rs.getString("type"),
                        rs.getDate("date_added"),
                        rs.getInt("quantity")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }


    public void updateProduct(Product product) {
        String sql = "UPDATE product SET name = ?, type = ?, quantity = ? WHERE product_id = ?";

        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getType());
            stmt.setInt(3, product.getQuantity());
            stmt.setInt(4, product.getProductId());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Product updated successfully!");
            } else {
                System.out.println("Product not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        String sql = "DELETE FROM product WHERE product_id = ?";

        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Product deleted successfully!");
            } else {
                System.out.println("Product not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
