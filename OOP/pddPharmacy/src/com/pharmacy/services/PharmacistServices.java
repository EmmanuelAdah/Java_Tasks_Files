package com.pharmacy.services;

import com.pharmacy.data.models.Drug;
import com.pharmacy.data.repository.Drugs;
import com.pharmacy.dtos.request.AddDrugRequest;
import com.pharmacy.dtos.responses.AddDrugResponse;
import static com.pharmacy.utils.Mapper.map;

public class PharmacistServices {
    private final Drugs drugs = new Drugs();

    public AddDrugResponse addDrug(AddDrugRequest addDrugRequest) {
        Drug drug = map(addDrugRequest);
        drugs.saveDrug(drug);
        return map(drug);
    }

}
