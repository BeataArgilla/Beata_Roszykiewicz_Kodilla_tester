import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        //given
        UsersManager manager = new UsersManager();
        //when
        List<String> result = manager.filterChemistGroupUsernames(); // z private zmieniłam na public, ale chyba nie powinno tak być
        //then
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");
        expectedResult.add("Gale Boetticher");
        assertEquals(expectedResult, result);
        System.out.println("chemist");
        System.out.println(result);
        System.out.println(expectedResult);
    }


    @Test
    public void testFilterChemistAgeUsernames() {
        //given
        UsersManager manager = new UsersManager();
        //when
        List<String> result = manager.filterChemistAgeUsernames();
        //then
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Walter White");
        expectedResult.add("Tuco Salamanca");
        expectedResult.add("Gus Firing");
        expectedResult.add("Gale Boetticher");
        assertEquals(expectedResult, result);
        System.out.println( "wiek");
        System.out.println(result);
        System.out.println(expectedResult);

    }
    @Test
    public void testFilterAgeAllUsernames() {
        //given
        UsersManager manager = new UsersManager();
        //when
        List<Integer> result = manager.filterAgeAllUsernames();
        //then
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(50);
        expectedResult.add(25);
        expectedResult.add(34);
        expectedResult.add(49);
        expectedResult.add(44);
        expectedResult.add(29);
        assertEquals(expectedResult, result);
        System.out.println("wiek");
        System.out.println(result);
        System.out.println(expectedResult);
    }

}