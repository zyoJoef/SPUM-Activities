package com.mycompany.product.java;

import java.sql.Date;

public class Product {
    private int productId;
    private String name;
    private String type;
    private Date dateAdded;
    private int quantity;


    public Product(String name, String type, Date dateAdded, int quantity) {
        this.name = name;
        this.type = type;
        this.dateAdded = dateAdded;
        this.quantity = quantity;
    }

    public Product(int productId, String name, String type, Date dateAdded, int quantity) {
        this(name, type, dateAdded, quantity);
        this.productId = productId;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public String getType() { return type; }
    public Date getDateAdded() { return dateAdded; }
    public int getQuantity() { return quantity; }

    public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setDateAdded(Date dateAdded) { this.dateAdded = dateAdded; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
