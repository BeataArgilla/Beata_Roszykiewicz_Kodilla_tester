package com.kodilla.inheritance.homework;

public class AllSystems {
    public static void main(String[] args) {

        OfficeSystem officeSystem2 = new OfficeSystem("Windows Office");
        OfficeSystem officeSystem = new OfficeSystem(2000,2010);
        officeSystem2.displayName();
        officeSystem.displayYearOn();
        officeSystem.displayYearOff();
        officeSystem2.dispLine();


        OperatingSystem operatingSystem2 = new OperatingSystem("UNIX");
        OperatingSystem operatingSystem = new OperatingSystem(1990,2002);
        operatingSystem2.displayName();
        operatingSystem.displayYearOn();
        operatingSystem.displayYearOff();
        operatingSystem2.dispLine();
        operatingSystem.dispLine();


        SystemToDo systemToDo2 = new SystemToDo("To Do List");
        SystemToDo systemToDo = new SystemToDo(2019, 2022);
        systemToDo2.displayName();
        systemToDo.displayYearOn(); // nie do końca czuję w tym przypadku na czym polega róznica w wyniku pomiędzy tym
        systemToDo.displayYearOff();
        System.out.println(systemToDo.turnON()); // a tym. Czy chodzi o to, że może to byc brane do dalszych kalkulacji, gdyby była taka potrzeba?
        systemToDo.dispLine();                     //


        int temp1 = systemToDo.turnOff() - systemToDo.turnON();
        System.out.println("System  " + systemToDo2.getName()+ "  był obecny na rynku:   " + temp1+ "  rok/lata");}
    }

