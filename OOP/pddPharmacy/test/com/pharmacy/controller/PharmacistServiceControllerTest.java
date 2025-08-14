package com.pharmacy.controller;

import com.pharmacy.data.repository.Drugs;
import com.pharmacy.dtos.request.AddDrugRequest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PharmacistServiceControllerTest {
    PharmacistServiceController controller = new PharmacistServiceController();
    Drugs drugs = new Drugs();

    @Test
    void pharmacistServiceControllerTest() {
        AddDrugRequest panadol = new AddDrugRequest(1L,
                "Panadol", LocalDate.now(), LocalDate.now().plusMonths(5));
        controller.recordNewDrug(panadol);
        assertEquals(1L, drugs.count());
    }
}