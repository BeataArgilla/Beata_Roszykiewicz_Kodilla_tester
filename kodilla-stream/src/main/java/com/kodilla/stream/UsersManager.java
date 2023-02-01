package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        System.out.println(filterChemistAgeUsernames());
        System.out.println(filterAgeAllUsernames());
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static List<String> filterChemistAgeUsernames() {
        List<String> usernames2 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >30)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames2;
    }

    public static List<Integer> filterAgeAllUsernames() {
        List<Integer> age = UsersRepository.getUsersList()
                .stream()
                .map(UsersManager::getUserAge)
                .collect(Collectors.toList());
        return age;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static Integer getUserAge(User user) {
        return user.getAge();
    }
}

