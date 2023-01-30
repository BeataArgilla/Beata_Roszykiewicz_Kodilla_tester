import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {

    @Test
            public void filterChemistGroupUsernames() {
        User user = new User("Walter White",50, 7, "Chemists");
        User user1 = new User("Jessie Pinkman", 25, 4648, "Sales");
       User user2 = new User("Tuco Salamanca", 34, 116, "Manager");
        User user3 = new User("Gus Firing", 49, 0, "Board");
       User user4 = new User("Gale Boetticher", 44, 2, "Chemists");
        User user5 = new User("Mike Ehrmantraut", 57, 0, "Security");

            String expectedUsername = user1.getUsername();

      //      String actualUsername = UsersRepository.getUserName(user1);

      //      assertEquals(expectedUsername, actualUsername);
        }



    @Test
    public void getUserNameTest() {
        User user = new User("Walter White",50, 7, "Chemists");;
        String expectedName = "Walter White";
     //   String actualName = User.getUserName(user);

     //   assertEquals(expectedName, actualName);
    }

    @Test
    public void processUsersStreamTest() {
        List<User> expectedList = new ArrayList<>();
        expectedList.add(new User("Walter White",50, 7, "Chemists"));
        expectedList.add(new User("Walter White",50, 7, "Chemists"));
        expectedList.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        expectedList.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expectedList.add(new User("Gus Firing", 49, 0, "Board"));
        expectedList.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedList.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        UsersRepository.getUsersList()
                .stream()
                .filter(userage -> userage.getAge() > 20)
                .map(name -> name.getUsername())
                .forEach(name -> System.out.println("My name is: " + name + " and I am older then given number."));

        List<User> actualList = UsersRepository.getUsersList();

        assertEquals(expectedList, actualList);
    }

}
