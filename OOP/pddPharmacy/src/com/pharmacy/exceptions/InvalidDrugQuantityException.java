package com.pharmacy.exceptions;

public class InvalidDrugQuantityException extends PharmacistException {
    public InvalidDrugQuantityException(String message) {
        super(message);
    }
}
