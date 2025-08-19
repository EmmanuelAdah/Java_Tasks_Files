package com.pharmacy.controller;

import com.pharmacy.data.repository.Drugs;
import com.pharmacy.dtos.request.AddDrugRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PharmacistServicesControllerTest {
    PharmacistServicesController controller;
    Drugs drugs;

    @BeforeEach
    void setUp() {
    controller = new PharmacistServicesController();
    drugs = new Drugs();
    }

    @AfterEach
    void tearDown() {
        drugs.clearList();
    }

    @Test
    void pharmacistServiceControllerTest() {
        AddDrugRequest panadol = new AddDrugRequest();
        panadol.setDrugId(1L);
        panadol.setDrugName("Panadol");
        panadol.setManufactureDate(LocalDate.now());
        panadol.setExpiryDate(LocalDate.now().plusMonths(5));
        panadol.setQuantity(32);
        controller.recordNewDrug(panadol);
        assertEquals(1L, drugs.count());
    }
}