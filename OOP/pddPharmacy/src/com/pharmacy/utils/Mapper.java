package com.pharmacy.utils;

import com.pharmacy.data.models.Drug;
import com.pharmacy.dtos.request.AddDrugRequest;

public class Mapper {

    public static Drug map(AddDrugRequest addDrugRequest){
        Drug drug = new Drug();
        drug.setName(addDrugRequest.getDrugName());
        drug.setId(addDrugRequest.getDrugId());
        drug.setManufactureDate(addDrugRequest.getManufactureDate());
        drug.setExpiryDate(addDrugRequest.getExpiryDate());
        return drug;
    }
}
