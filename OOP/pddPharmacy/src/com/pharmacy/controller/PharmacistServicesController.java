package com.pharmacy.controller;

import com.pharmacy.dtos.request.AddDrugRequest;
import com.pharmacy.services.PharmacistServices;

public class PharmacistServicesController {
    PharmacistServices pharmacistServices = new PharmacistServices();

    public void recordNewDrug(AddDrugRequest addDrugRequest){
        pharmacistServices.addDrug(addDrugRequest);
    }
}
