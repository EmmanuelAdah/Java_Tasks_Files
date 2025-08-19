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
        Drug alabukum = new Drug();
        alabukum.setId(2L);
        alabukum.setName("alabukum");
        alabukum.setType(Type.ANTIBIOTIC);
        alabukum.setCategory(Category.CAPSULE);
        alabukum.setManufactureDate(LocalDate.now());
        alabukum.setExpiryDate(LocalDate.now().plusMonths(5));
        alabukum.setDateAdded(LocalDate.now());
        alabukum.setQuantity(4);
        drugs.saveDrug(alabukum);
        assertEquals(1L, drugs.count());
    }

    @Test
    void deleteDrugTest(){
        Drug panadol = new Drug();
        panadol.setId(1L);
        panadol.setName("panadol");
        panadol.setType(Type.ANTIBIOTIC);
        panadol.setCategory(Category.TABLET);
        panadol.setManufactureDate(LocalDate.now());
        panadol.setExpiryDate(LocalDate.now().plusMonths(6));
        panadol.setDateAdded(LocalDate.now());
        panadol.setQuantity(6);
        drugs.saveDrug(panadol);
        drugs.deleteById(1L);
        assertEquals(0L, drugs.count());
    }

    @Test
    void deleteDrugByIdTest(){
        Drug panadol = new Drug();
        panadol.setId(2L);
        panadol.setName("panadol");
        panadol.setType(Type.ANTIBIOTIC);
        panadol.setCategory(Category.TABLET);
        panadol.setManufactureDate(LocalDate.now());
        panadol.setExpiryDate(LocalDate.now().plusMonths(6));
        panadol.setDateAdded(LocalDate.now());
        panadol.setQuantity(6);
        drugs.saveDrug(panadol);
        drugs.deleteById(2L);
        assertEquals(0L, drugs.count());
    }

    @Test
    void deleteDrugByInvalidIdTest(){
        Drug alabukum = new Drug();
        alabukum.setId(2L);
        alabukum.setName("alabukum");
        alabukum.setType(Type.ANTIBIOTIC);
        alabukum.setCategory(Category.CAPSULE);
        alabukum.setManufactureDate(LocalDate.now());
        alabukum.setExpiryDate(LocalDate.now().plusMonths(5));
        alabukum.setDateAdded(LocalDate.now());
        alabukum.setQuantity(4);
        drugs.saveDrug(alabukum);
        drugs.deleteById(1);
        assertEquals(1L, drugs.count());
    }

    @Test
    void findDrugByIdTest(){
        Drug panadol = new Drug();
        panadol.setId(1L);
        panadol.setName("panadol");
        panadol.setType(Type.ANTIBIOTIC);
        panadol.setCategory(Category.TABLET);
        panadol.setManufactureDate(LocalDate.now());
        panadol.setExpiryDate(LocalDate.now().plusMonths(6));
        panadol.setDateAdded(LocalDate.now());
        panadol.setQuantity(6);
        drugs.saveDrug(panadol);

        Drug alabukum = new Drug();
        alabukum.setId(2L);
        alabukum.setName("alabukum");
        alabukum.setType(Type.ANTIBIOTIC);
        alabukum.setCategory(Category.CAPSULE);
        alabukum.setManufactureDate(LocalDate.now());
        alabukum.setExpiryDate(LocalDate.now().plusMonths(5));
        alabukum.setDateAdded(LocalDate.now());
        alabukum.setQuantity(4);
        drugs.saveDrug(alabukum);
        assertEquals(panadol, drugs.findById(1L));
        assertNull(drugs.findById(3L));
    }

    @Test
    void findDrugByNameTest(){
        Drug alabukum = new Drug();
        alabukum.setId(1L);
        alabukum.setName("alabukum");
        alabukum.setType(Type.ANTIBIOTIC);
        alabukum.setCategory(Category.CAPSULE);
        alabukum.setManufactureDate(LocalDate.now());
        alabukum.setExpiryDate(LocalDate.now().plusMonths(5));
        alabukum.setDateAdded(LocalDate.now());
        alabukum.setQuantity(4);
        drugs.saveDrug(alabukum);
        assertEquals(alabukum, drugs.findByName("alabukum"));
        assertNull(drugs.findByName("panadol"));
    }

    @Test
    void findDrugByNameWithInvalidNameTest(){
        Drug alabukum = new Drug();
        alabukum.setId(2L);
        alabukum.setName("alabukum");
        alabukum.setType(Type.ANTIBIOTIC);
        alabukum.setCategory(Category.CAPSULE);
        alabukum.setManufactureDate(LocalDate.now());
        alabukum.setExpiryDate(LocalDate.now().plusMonths(5));
        alabukum.setDateAdded(LocalDate.now());
        alabukum.setQuantity(4);
        drugs.saveDrug(alabukum);
        assertNull(drugs.findByName("panadol"));
    }

    @Test
    void updateDrugTest(){
        Drug alabukum = new Drug();
        alabukum.setId(2L);
        alabukum.setName("alabukum");
        alabukum.setType(Type.ANTIBIOTIC);
        alabukum.setCategory(Category.CAPSULE);
        alabukum.setManufactureDate(LocalDate.now());
        alabukum.setExpiryDate(LocalDate.now().plusMonths(5));
        alabukum.setDateAdded(LocalDate.now());
        alabukum.setQuantity(4);
        drugs.saveDrug(alabukum);

        Drug panadol = new Drug();
        panadol.setId(2L);
        panadol.setName("panadol");
        panadol.setType(Type.ANTIBIOTIC);
        panadol.setCategory(Category.TABLET);
        panadol.setManufactureDate(LocalDate.now());
        panadol.setExpiryDate(LocalDate.now().plusMonths(6));
        panadol.setDateAdded(LocalDate.now());
        panadol.setQuantity(6);
        drugs.update(panadol);
        assertEquals(1L, drugs.count());
    }
}