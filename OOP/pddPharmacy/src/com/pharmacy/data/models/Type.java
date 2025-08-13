package com.pharmacy.data.models;

public enum Type {
    ANTIBIOTIC, ANALGEIC, PAINKILLER;

    private final String[] type;

    Type(String... type){
        this.type = type;
    }
}
