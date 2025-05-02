package com.example.demo.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest {

    @Test
    void testConstructeurParDéfaut() {
        Voiture voiture = new Voiture();
        assertNull(voiture.getMarque());
        assertEquals(0, voiture.getPrix());
        assertEquals(0, voiture.getId());
    }

    @Test
    void testConstructeurParamétré() {
        Voiture voiture = new Voiture("Toyota", 20000);
        assertEquals("Toyota", voiture.getMarque());
        assertEquals(20000, voiture.getPrix());
        assertEquals(0, voiture.getId()); // Non initialisé
    }

    @Test
    void testSetEtGetId() {
        Voiture voiture = new Voiture();
        voiture.setId(42);
        assertEquals(42, voiture.getId());
    }

    @Test
    void testSetEtGetMarque() {
        Voiture voiture = new Voiture();
        voiture.setMarque("Renault");
        assertEquals("Renault", voiture.getMarque());
    }

    @Test
    void testSetEtGetPrix() {
        Voiture voiture = new Voiture();
        voiture.setPrix(15000);
        assertEquals(15000, voiture.getPrix());
    }

    @Test
    void testToString() {
        Voiture voiture = new Voiture("Peugeot", 18000);
        voiture.setId(7);
        String attendu = "Car{marque='Peugeot', prix=18000, id=7}";
        assertEquals(attendu, voiture.toString());
    }
}
