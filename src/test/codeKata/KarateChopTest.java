package test.codeKata;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.codeKata.KarateChop;

public class KarateChopTest {

	@Test
	public void testCases() {
		KarateChop karate = new KarateChop();
		//@formatter:off
		  assertEqual(-1, karate.binarychop1(3, new int[]{}));
		  assertEqual(-1, karate.binarychop1(3, new int[]{1}));
		  assertEqual(0,  karate.binarychop1(1, new int[]{1}));
		  //
		  assertEqual(0,  karate.binarychop1(1, new int[]{1, 3, 5}));
		  assertEqual(1,  karate.binarychop1(3, new int[]{1, 3, 5}));
		  assertEqual(2,  karate.binarychop1(5, new int[]{1, 3, 5}));
		  assertEqual(-1, karate.binarychop1(0, new int[]{1, 3, 5}));
		  assertEqual(-1, karate.binarychop1(2, new int[]{1, 3, 5}));
		  assertEqual(-1, karate.binarychop1(4, new int[]{1, 3, 5}));
		  assertEqual(-1, karate.binarychop1(6, new int[]{1, 3, 5}));
		  //
		  assertEqual(0,  karate.binarychop1(1, new int[]{1, 3, 5, 7}));
		  assertEqual(1,  karate.binarychop1(3, new int[]{1, 3, 5, 7}));
		  assertEqual(2,  karate.binarychop1(5, new int[]{1, 3, 5, 7}));
		  assertEqual(3,  karate.binarychop1(7, new int[]{1, 3, 5, 7}));
		  assertEqual(-1, karate.binarychop1(0, new int[]{1, 3, 5, 7}));
		  assertEqual(-1, karate.binarychop1(2, new int[]{1, 3, 5, 7}));
		  assertEqual(-1, karate.binarychop1(4, new int[]{1, 3, 5, 7}));
		  assertEqual(-1, karate.binarychop1(6, new int[]{1, 3, 5, 7}));
		  assertEqual(-1, karate.binarychop1(8, new int[]{1, 3, 5, 7}));
		  //@formatter:on
		System.out.println("done");
	}

	private void assertEqual(int i, int chop) {
		assertTrue(i == chop);

	}
}
