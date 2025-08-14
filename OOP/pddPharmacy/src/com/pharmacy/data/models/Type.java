package com.pharmacy.data.models;

public enum Type {
    ANTIBIOTIC, ANALGEIC, MULTIVITAMIN, PROBIOTIC, PAINKILLER;

    private final String[] type;

    Type(String... type){
        this.type = type;
    }

    public String[] getType() {
        return type;
    }
}
