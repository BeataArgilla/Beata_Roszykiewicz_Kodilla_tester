package com.kodilla.abstracts.homework;

public class PracownikLiniowy extends Job{
    String nameOfJob = "Pracownik linowy";
    public String getNameOfJob(){
        return  nameOfJob;
    }


    @Override
    public String getResponsibility() {
        return "Rozłożenie leżaka i równomierne opalanie się";
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
