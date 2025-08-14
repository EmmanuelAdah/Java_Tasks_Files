package com.pharmacy.controller;

import com.pharmacy.dtos.request.AddDrugRequest;
import com.pharmacy.services.PharmacistService;

public class PharmacistServiceController {
    PharmacistService pharmacistService = new PharmacistService();

    public void recordNewDrug(AddDrugRequest addDrugRequest){
        pharmacistService.addDrug(addDrugRequest);
    }
}
