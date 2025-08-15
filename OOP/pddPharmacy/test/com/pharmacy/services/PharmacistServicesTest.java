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
        AddDrugRequest addDrugRequest = new AddDrugRequest(1L,
                "Panadol", LocalDate.now(), LocalDate.now().plusMonths(5));
        pharmacistServices.addDrug(addDrugRequest);
        assertEquals(1L, drugs.count());
    }
}