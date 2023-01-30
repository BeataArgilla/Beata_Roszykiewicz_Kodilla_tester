package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John Wisniewski", new Teacher(null)));
        students.add(new Student("Sandra Bullock", new Teacher("Bobby Williams")));
        students.add(new Student("Cay Horseman", new Teacher("Bobby Williams")));
        students.add(new Student("Ozzy Rush", new Teacher(null)));
        students.add(new Student("Jessica Busch", new Teacher("Ann Rand")));

        System.out.println(students.size());

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            if (optionalTeacher.isPresent()) {
                System.out.println("Hallo");
            }
            else {
        //        String name = optionalTeacher.orElse(new Teacher(null)).getName();
            System.out.println(("uczeń: " +student.getName() + " , nauczyciel: <undefined>"));}

            }

        }
}




