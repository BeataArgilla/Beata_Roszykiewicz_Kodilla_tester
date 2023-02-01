import com.kodilla.stream.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTestSuite {

    @Test
    public void testPostAvgUnder40() {

//given
        ForumStats forumStats = new ForumStats();

//when
        double result1 = forumStats.ageUnder40();
// then
        assertEquals(1588, result1, 2);
    }
    @Test
    public void testPostAvgOver40() {

//given
        ForumStats forumStats = new ForumStats();

//when
        double result2 = forumStats.ageOver40();
// then

        assertEquals(3, result2, 2);
    }
}
