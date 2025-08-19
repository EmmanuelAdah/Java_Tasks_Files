package com.pharmacy.services;

import com.pharmacy.data.repository.Drugs;
import com.pharmacy.dtos.request.AddDrugRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PharmacistServicesTest {
    Drugs drugs;
    PharmacistServices pharmacistServices;

    @BeforeEach
    void setUp() {
        drugs = new Drugs();
        pharmacistServices = new PharmacistServices();
    }

    @Test
    void pharmacistAddDrugTest(){
        AddDrugRequest addDrugRequest = new AddDrugRequest();
        addDrugRequest.setDrugId(1L);
        addDrugRequest.setDrugName("Panadol");
        addDrugRequest.setManufactureDate(LocalDate.now());
        addDrugRequest.setExpiryDate(LocalDate.now().plusMonths(5));
        addDrugRequest.setQuantity(23);
        pharmacistServices.addDrug(addDrugRequest);
        assertEquals(1L, drugs.count());
    }

    @Test
    void buyDrugTest(){

    }
}