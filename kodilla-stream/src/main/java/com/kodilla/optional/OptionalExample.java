package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("Barnaba", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);

        String username = optionalUser.orElse(new User("", 0, 0, "")).getUsername();
        System.out.println(username); //wychodzi Barnaba i to jest ok:)

        String username1 = optionalUser.orElse(new User("Janek", 10, 10, "X")).getUsername();
        System.out.println(username1); // też wychodzi Barnaba

            User user2 = null;
            Optional<User> optionalUser2 = Optional.ofNullable(user2);
            String username2 = optionalUser2.orElse(new User("Krzyś", 0, 0, "")).getUsername();
        System.out.println(username2); //wychodzi Krzyś

        User user3 = new User("Koleś", 30, 100, "Test");

        Optional<User> optionalUser3 = Optional.ofNullable(user3);

        optionalUser3.ifPresent(u -> System.out.println(u.getUsername())); //wychodzi Koleś

        }
    }

