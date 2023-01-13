package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classes = new ArrayList<>();
    public School(List<Integer> classes) {
        this.classes= classes;
    }
    public int getSumOfStudentsInTheSchool() {
        int sum = 0;
        for (int school : classes)
            sum += school;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }
}
