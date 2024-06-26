package com.roxiler.model;



import java.util.Date;

public class Transaction {
    private long id;
    private String productName;
    private String description;
    private double price;
    private Date dateOfSale;



    // Constructor, getters, and setters
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Transaction(long id, String productName, String description, double price, Date dateOfSale) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.dateOfSale = dateOfSale;
    }

    public Transaction() {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", dateOfSale=" + dateOfSale +
                '}';
    }
}

