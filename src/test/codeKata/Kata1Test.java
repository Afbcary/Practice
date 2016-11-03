package test.codeKata;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.codeKata.Kata1;

public class Kata1Test {

	private Kata1 kata1;

	@Before
	public void setup() {
		kata1 = new Kata1();
	}

	@Test
	public void testAddNullNumbers() {
		int sum = kata1.Add(null);
		assertTrue(0 == sum);
	}

	@Test
	public void testAddZeroNumbers() {
		int sum = kata1.Add("");
		assertTrue(0 == sum);
	}

	@Test
	public void testAddOneNumber1() {
		int sum = kata1.Add("1");
		assertTrue(1 == sum);
	}

	@Test
	public void testAddOneNumber5() {
		int sum = kata1.Add("5");
		assertTrue(5 == sum);
	}

	@Test
	public void testAddOneNumber24() {
		int sum = kata1.Add("24");
		assertTrue(24 == sum);
	}

	@Test
	public void testAddTwoNumbers() {
		int sum = kata1.Add("1,1");
		assertTrue(2 == sum);
	}

	@Test
	public void testAddTwoNumbersTwoDigits() {
		int sum = kata1.Add("11,12");
		assertTrue(23 == sum);
	}

	@Test
	public void testAddMoreThanTwoNumbers() {
		int sum = kata1.Add("1,2,3,4,5,6,7");
		assertTrue(1 + 2 + 3 + 4 + 5 + 6 + 7 == sum);
	}

	@Test
	public void testSplitByNewline() {
		int sum = kata1.Add("11" + "/n" + "12");
		assertTrue(23 == sum);
	}

	@Test
	public void testSplitByMix() {
		int sum = kata1.Add("11/n12,1");
		assertTrue(24 == sum);
	}

	@Test
	public void testChangeDelimiter() {
		int sum = kata1.Add("//;\n1;2");
		assertTrue(3 == sum);
	}
}
