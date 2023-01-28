package com.kodilla.optional.homework;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name, Teacher teacher){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
