package test.codewars;

import org.junit.Assert;
import org.junit.Test;

import main.codewars.TheClockwiseSpiral;

public class TheClockwiseSpiralTest {

	@Test
	public void should_test_spiral() {
		//@formatter:off
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        //@formatter:on

		Assert.assertArrayEquals(expected, TheClockwiseSpiral.createSpiral(3));

	}

	@Test
	public void testPrintSpiral() {
		//@formatter:off
        int[][] expected = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}};
        //@formatter:on
		TheClockwiseSpiral.printSpiral(expected);
	}
}