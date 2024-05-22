package com.example.automobil;

public class Automobil {
    private String marka;
    private String model;
    private int godinaProizvodnje;
    private Motor motor;
    private Proizvodjac proizvodjac;

    public Automobil(String marka, String model, int godinaProizvodnje, Motor motor, Proizvodjac proizvodjac) {
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.motor = motor;
        this.proizvodjac = proizvodjac;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public void prikaziDetalje() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Godina Proizvodnje: " + godinaProizvodnje);
        System.out.println("Motor: " + motor.getTip());
        System.out.println("Proizvodjac: " + proizvodjac.getIme());
    }
}
