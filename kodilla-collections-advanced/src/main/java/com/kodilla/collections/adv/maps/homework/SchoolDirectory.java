package com.kodilla.collections.adv.maps.homework;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        Principal harvard = new Principal("Harvard", "Alex", "Baldwin");
        Principal hogwart = new Principal("Hogwart", "Harry", "Potter");
        Principal MIT = new Principal("MIT", "Hellen", "Strawberry");
        Principal warsawUniversity = new Principal("University Of Warsaw", "Beata", "Roszykiewicz");


        School harvardSchool = new School(Arrays.asList(30,15,20,10,18));
        School hogwartdSchool = new School(Arrays.asList(30,15,20,10,18));
        School mitSchool = new School(Arrays.asList(30,15,20,10,18));
        School warsawUniversitySchool = new School(Arrays.asList(30,15,20,10,18));

        schoolMap.put(harvard, harvardSchool);
        schoolMap.put(hogwart, hogwartdSchool);
        schoolMap.put(MIT, mitSchool);
        schoolMap.put(warsawUniversity, warsawUniversitySchool);


        for (Map.Entry<Principal, School> schooltEntry : schoolMap.entrySet())
            System.out.println(schooltEntry.getKey().getSchoolName() +",  "+ schooltEntry.getKey().getFirstname()+ " "+ schooltEntry.getKey().getLastname() + ", number of Students in the classes: "
                    + schooltEntry.getValue().getSumOfStudentsInTheSchool());
    }

}
