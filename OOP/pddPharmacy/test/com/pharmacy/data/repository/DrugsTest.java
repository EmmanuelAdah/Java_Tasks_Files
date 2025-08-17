package com.pharmacy.data.repository;

import com.pharmacy.data.models.Category;
import com.pharmacy.data.models.Drug;
import com.pharmacy.data.models.Type;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class DrugsTest {
    Drugs drugs;

    @BeforeEach
    void setUp() {
        drugs = new Drugs();
    }

    @AfterEach
    void tearDown() {
        drugs.clearList();
    }

    @Test
    void drugCountIsEmptyTest(){
        assertEquals(0L, drugs.count());
    }

    @Test
    void addDrugTest(){
        Drug drug = new Drug(2L, "panadol", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(drug);
        assertEquals(1L, drugs.count());
    }

    @Test
    void deleteDrugTest(){
        Drug panadol = new Drug(2L, "panadol", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(panadol);
        drugs.delete();
        assertEquals(0L, drugs.count());
    }

    @Test
    void deleteDrugByIdTest(){
        Drug drug = new Drug(2L, "panadol", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(drug);
        drugs.deleteById(2);
        assertEquals(0L, drugs.count());
    }

    @Test
    void deleteDrugByInvalidIdTest(){
        Drug drug = new Drug(2L, "panadol", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(drug);
        drugs.deleteById(1);
        assertEquals(1L, drugs.count());
    }

    @Test
    void findDrugByIdTest(){
        Drug panadol = new Drug(1L, "panadol", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(panadol);
        Drug alabukum = new Drug(2L, "alabukum", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(alabukum);
        assertEquals(panadol, drugs.findById(1L));
        assertNull(drugs.findById(3L));
    }

    @Test
    void findDrugByNameTest(){
        Drug alabukum = new Drug(2L, "alabukum", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(alabukum);
        assertEquals(alabukum, drugs.findByName("alabukum"));
        assertNull(drugs.findByName("panadol"));
    }

    @Test
    void findDrugByNameWithInvalidNameTest(){
        Drug alabukum = new Drug(2L, "alabukum", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(alabukum);
        assertNull(drugs.findByName("panadol"));
    }

    @Test
    void updateDrugTest(){
        Drug alabukum = new Drug(1L, "alabukum", Type.ANTIBIOTIC, Category.CAPSULE,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.saveDrug(alabukum);
        Drug panadol = new Drug(2L, "panadol", Type.PAINKILLER, Category.TABLET,
                LocalDate.now(), LocalDate.now().plusMonths(5), LocalDate.now(), 4);
        drugs.update(panadol);
        assertEquals(1L, drugs.count());
    }
}