package com.kodilla.stream;


public class ForumStats {
    public static void main(String[] args) {

        System.out.println(ageUnder40());
        System.out.println(ageOver40());
    }
        public static Double ageUnder40 () {
            double averageNumberOfPostsAgeUserLess40 = UsersRepository.getUsersList()
                    .stream()
                    .filter(a -> a.getAge() < 40)
                    .mapToInt(n -> n.getNumberOfPost())
                    .average()
                    .getAsDouble();
            return averageNumberOfPostsAgeUserLess40;

        }

        public static Double ageOver40 () {
            double averageNumberOfPostsAgeUserOver40 = UsersRepository.getUsersList()
                    .stream()
                    .filter(a -> a.getAge() > 40)
                    .mapToInt(n -> n.getNumberOfPost())
                    .average()
                    .getAsDouble();
            return averageNumberOfPostsAgeUserOver40;

        }
    }



