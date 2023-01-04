package com.kodilla.abstracts.homework;

public class Manager extends Job{
    String nameOfJob = "Manager";
    public String getNameOfJob(){
        return  nameOfJob;
    }


    @Override
    public String getResponsibility() {
        return " Obowiązek codziennego picia kawy";
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
