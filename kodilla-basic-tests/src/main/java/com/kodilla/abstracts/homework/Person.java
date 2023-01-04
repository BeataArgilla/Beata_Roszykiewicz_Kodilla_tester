package com.kodilla.abstracts.homework;

public class Person {
    public static void main(String[] args) {
        String firstName = "Beata";
        int age = 5;
        String job;


        Manager manager = new Manager();
        System.out.println(firstName+", lat:"+age+", stanowisko: "+manager.getNameOfJob() + "  i jej/jego obowiązki to: "+ manager.getResponsibility());



    }
}

