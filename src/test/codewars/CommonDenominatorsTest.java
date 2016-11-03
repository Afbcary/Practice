package test.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.codewars.CommonDenominators;

public class CommonDenominatorsTest {

	@Test
	public void test_fractions() {
		long[][] lst;
		lst = new long[][] {
				{
						1,
						2
				}, {
						1,
						3
				}, {
						1,
						4
				}
		};
		assertEquals("(6,12)(4,12)(3,12)", CommonDenominators.convertFrac(lst));
	}

	@Test
	public void testFractionsWithZeroNumerator() {
		long[][] lst;
		lst = new long[][] {
				{
						1,
						2
				}, {
						0,
						3
				}, {
						1,
						4
				}
		};
		assertEquals("(6,12)(0,12)(3,12)", CommonDenominators.convertFrac(lst));
	}

	@Test
	public void testMoreFractions() {
		long[][] lst;
		lst = new long[][] {
				{
						1,
						5
				}, {
						1,
						6
				}, {
						1,
						7
				}, {
						1,
						8
				}, {
						1,
						9
				}
		};
		assertEquals("(504,2520)(420,2520)(360,2520)(315,2520)(280,2520)", CommonDenominators.convertFrac(lst));
	}

}
