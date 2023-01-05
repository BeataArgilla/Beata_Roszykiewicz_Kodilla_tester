package com.kodilla.abstracts.homework;

public class Presentation {
    public static void main(String[] args) {
        Person anna = new Person("Anna", 30, new Manager(5000,"Raportowanie"));
        System.out.println("Imię pracownika: "+anna.firstName+ ", wiek: "+anna.age+ ", zakres obowiązków: "+ anna.job.responsibility );

        Person radek = new Person("Radek", 40, new Kierowca(10000,"Dostarczanie towaru"));
        System.out.println("Imię pracownika: "+radek.firstName+ ", wiek: "+radek.age+ ", zakres obowiązków: "+ radek.job.responsibility);

        Person waldek = new Person("Waldek", 30, new PracownikLiniowy(6000,"Obsługa maszyny"));
        System.out.println("Imię pracownika: "+waldek.firstName+ ", wiek: "+waldek.age+ ", zakres obowiązków: "+ waldek.job.responsibility );

    }

}
