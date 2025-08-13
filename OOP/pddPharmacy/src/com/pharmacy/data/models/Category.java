package com.pharmacy.data.models;

public enum Category {
    SYRUP, GEL, CAPSULE, INJECTION, TABLET, IV;

    private String[] category;

    Category(String... category){
        this.category = category;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }
}
