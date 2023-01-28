package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John Wisniewski", null));
        students.add(new Student("Sandra Bullock", new Teacher("Bobby Williams")));
        students.add(new Student("Cay Horseman", new Teacher("Bobby Williams")));
        students.add(new Student("Ozzy Rush", null));
        students.add(new Student("Jessica Busch", new Teacher("Ann Rand")));

        System.out.println(students.size());

        for (Student varX : students) {
            Optional<Student> optionalStudent = Optional.ofNullable(null);
            if (optionalStudent.ifPresent()) {
                System.out.println("uczeń: " + varX.getName() + ", nauczyciel: " + varX.getTeacher());
            } else {
                System.out.println("<undefined>");

            }

        }

    }
}

