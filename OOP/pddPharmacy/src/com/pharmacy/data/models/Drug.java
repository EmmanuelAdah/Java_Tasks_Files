package com.pharmacy.data.models;
import java.time.LocalDateTime;

public class Drug {
    private long id;
    private String name;
    private Type type;
    private Category category;
    private LocalDateTime manufactureDate;
    private LocalDateTime expiryDate;
    private LocalDateTime dateAdded;
    private int quantity;

    public Drug(long id,
                String name,
                Type type,
                Category category,
                LocalDateTime manufactureDate,
                LocalDateTime expiryDate,
                LocalDateTime dateAdded,
                int quantity){

        this.id = id;
        this.name = name;
        this.type = type;
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.dateAdded = dateAdded;
        this.quantity = quantity;
    }
    public long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDateTime getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDateTime manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
