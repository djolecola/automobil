package com.example.automobil;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutomobilTest {

    @Test
    public void testAutomobil() {
        // Kreiranje instance klase Automobil
        Motor motor = new Motor("V6");
        Proizvodjac proizvodjac = new Proizvodjac("Toyota");
        Automobil automobil = new Automobil("Camry", "Sedan", 2020, motor, proizvodjac);

        // Postavljanje novih vrednosti koristeći settere
        automobil.setMarka("Honda");
        automobil.setModel("Civic");
        automobil.setGodinaProizvodnje(2021);
        automobil.setMotor(new Motor("V8"));
        automobil.setProizvodjac(new Proizvodjac("Honda"));

        // Provera vrednosti koristeći gettere i asertacije
        assertEquals("Honda", automobil.getMarka());
        assertEquals("Civic", automobil.getModel());
        assertEquals(2021, automobil.getGodinaProizvodnje());
        assertEquals("V8", automobil.getMotor().getTip());
        assertEquals("Honda", automobil.getProizvodjac().getIme());
    }
}