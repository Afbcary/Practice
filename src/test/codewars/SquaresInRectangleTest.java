package test.codewars;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.codewars.SquaresInRectangle;

public class SquaresInRectangleTest {

	@Test
	public void test1() {
		List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
		assertEquals(res, SquaresInRectangle.sqInRect(5, 3));
	}

	@Test
	public void test2() {
		assertEquals(null, SquaresInRectangle.sqInRect(5, 5));
	}
}