package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOn;
    private int yearOff;
    private String name;

    public OperatingSystem(int yearOn, int yearOff) {
        this.yearOn = yearOn;
        this.yearOff = yearOff;
    }
    public OperatingSystem(String name) {
        this.name = name;
    }
    public int turnON() {
        return yearOn;
    }
    public int turnOff() {
        return yearOff;
    }
    public String getName() {
        return name;
    }
    public void displayYearOn() {
        System.out.println("Rok wydania systemu: " + yearOn);
    }
    public void displayYearOff() {
        System.out.println("Rok wycofania systemu: " + yearOff);
    }
    public void displayName() {
        System.out.println("Nazwa systemu: " + name);
    }
    public void dispLine() {
        System.out.println("..........................");
    }
}


