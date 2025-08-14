package com.pharmacy.services;

import com.pharmacy.data.models.Category;
import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Type;
import com.pharmacy.data.repository.Drugs;
import com.pharmacy.dtos.request.AddDrugRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PharmacistServiceTest {
    Drugs drugs;
    PharmacistService pharmacistService;

    @BeforeEach
    void setUp() {
        drugs = new Drugs();
        pharmacistService = new PharmacistService();
    }

    @Test
    void pharmacistAddDrugTest(){
        AddDrugRequest addDrugRequest = new AddDrugRequest(1L, "Panadol", LocalDate.now(), LocalDate.now().plusMonths(5));
        pharmacistService.addDrug(addDrugRequest);
    }
}