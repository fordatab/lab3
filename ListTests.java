import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class ListTests {
    private ArrayList<String> list;
    @Before
    public void setUp() {
        list = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g"));
    }

    @Test
    public void testFilter() {
        System.out.println(list);
        assertArrayEquals(new String[] {"a", "b", "c", "d", "e", "f", "g"},
                ListExamples.filter(list, new StrChecker()).toArray());
    }

    @Test
    public void merge() {

    }
}
