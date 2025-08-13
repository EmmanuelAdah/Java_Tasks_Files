package com.pharmacy.data.repository;

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
}