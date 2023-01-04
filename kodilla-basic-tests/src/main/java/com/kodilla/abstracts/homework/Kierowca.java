package com.kodilla.abstracts.homework;

public class Kierowca extends Job{
    String nameOfJob = "Kierowca";
    public String getNameOfJob() {
        return nameOfJob;
    }

        @Override
        public String getResponsibility () {
            return "Obowiązek codziennego umycia 1 koła";
        }

        @Override
        public int getSalary () {
            return 0;
        }
    }

