package com.kodilla.abstracts.homework;

public class KierownikProdukcji extends Job{
    String nameOfJob = "Kierownik produkcji";
    public String getNameOfJob() {
        return nameOfJob;
    }

    @Override
    public String getResponsibility() {
        return "Uruchomienie linii produkcyjnej i zapalenie 1 cygara";
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
