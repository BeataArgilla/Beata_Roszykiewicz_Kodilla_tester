package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;
    private String schoolName;

    public Principal(String schoolName,String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.schoolName = schoolName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return firstname.equals(principal.firstname) && lastname.equals(principal.lastname) && schoolName.equals(principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, schoolName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

