package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Patient{

    private String nationalRegistryNumber;
    private String fullNamme;
    private int age;
    private int temperature;
    private boolean unknownVirus;
    private boolean ensured;

    public Patient() {
    }

    public Patient(String nationalRegistryNumber, String fullNamme, int age, int temperature, boolean unknownVirus, boolean ensured) {
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.fullNamme = fullNamme;
        this.age = age;
        this.temperature = temperature;
        this.unknownVirus = unknownVirus;
        this.ensured = ensured;
    }

    public String getNationalRegistryNumber() {
        return nationalRegistryNumber;
    }

    public void setNationalRegistryNumber(String nationalRegistryNumber) {
        this.nationalRegistryNumber = nationalRegistryNumber;
    }

    public String getFullNamme() {
        return fullNamme;
    }

    public void setFullNamme(String fullNamme) {
        this.fullNamme = fullNamme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isUnknownVirus() {
        return unknownVirus;
    }

    public void setUnknownVirus(boolean unknownVirus) {
        this.unknownVirus = unknownVirus;
    }

    public boolean isEnsured() {
        return ensured;
    }

    public void setEnsured(boolean ensured) {
        this.ensured = ensured;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "nationalRegistryNumber='" + nationalRegistryNumber + '\'' +
                ", fullNamme='" + fullNamme + '\'' +
                ", age=" + age +
                ", temperature=" + temperature +
                ", unknownVirus=" + unknownVirus +
                ", ensured=" + ensured +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient patient)) return false;
        return age == patient.age && temperature == patient.temperature && unknownVirus == patient.unknownVirus && ensured == patient.ensured && Objects.equals(nationalRegistryNumber, patient.nationalRegistryNumber) && Objects.equals(fullNamme, patient.fullNamme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nationalRegistryNumber, fullNamme, age, temperature, unknownVirus, ensured);
    }



}
