package com.pharmacy.utils;

import com.pharmacy.dtos.request.AddDrugRequest;
import com.pharmacy.exceptions.InvalidDrugQuantityException;

public class Validator {

    public static void validate(AddDrugRequest addDrugRequest){
        if (addDrugRequest.getQuantity() <= 0) throw new InvalidDrugQuantityException("Quantity must be greater than 0") ;
    }
}
