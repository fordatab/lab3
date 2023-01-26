import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayTests {

    private int[] in;

    @Before
    public void setUp() throws Exception {
        in = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
    @Test
    public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    }

    @Test
    public void testReverseInPlaceCorrect() {
        ArrayExamples.reverseInPlace(in);
        System.out.println(Arrays.toString(in));
        assertArrayEquals(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, in);
    }

    @Test
    public void testReversedCorrect() {
        //System.out.println(Arrays.toString(ArrayExamples.reversed(in)));
        assertArrayEquals(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                ArrayExamples.reversed(in));
    }
}
