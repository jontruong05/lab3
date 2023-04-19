import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
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
  public void testOtherReverseInPlace() {
    int[] intArr = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(intArr);
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, intArr);
  }

  @Test
  public void testOtherReverse() {
    int[] intArr = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, ArrayExamples.reversed(intArr));
  }

  @Test
  public void testMultipleLowest() {
    double[] dblArr = {0.7, 9.9, 0.7};
    assertEquals(5.3, ArrayExamples.averageWithoutLowest(dblArr), 0);
  }
}