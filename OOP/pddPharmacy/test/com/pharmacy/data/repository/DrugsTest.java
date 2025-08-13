package com.pharmacy.data.repository;

import com.pharmacy.data.models.Drug;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrugsTest {
    Drugs drugs;

    @BeforeEach
    void setUp() {
        drugs = new Drugs();
    }

    @Test
    void drugCountIsEmptyTest(){
        assertEquals(0L, drugs.count());
    }

    @Test
    void addDrugTest(){
        drugs.saveDrug(new Drug());
        assertEquals(1L, drugs.count());
    }

    @Test
    void deleteDrugTest(){
        drugs.saveDrug(new Drug());
        drugs.delete();
        assertEquals(0L, drugs.count());
    }

    @Test
    void deleteDrugByIdTest(){
        drugs.saveDrug();
        drugs.deleteById(1);
        assertEquals(0L, drugs.count());
    }
}