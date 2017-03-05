package test.codewars;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.codewars.DoubleCola;

public class DoubleColaTest {

	private String[] names;

	@Before
	public void setup() {
		names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

	}

	@Test
	public void test1() {
		assertEquals("Sheldon", DoubleCola.WhoIsNext(names, 1));
	}
	@Test
	public void test4() {
		assertEquals("Rajesh", DoubleCola.WhoIsNext(names, 4));
	}

	@Test
	public void test6() {
		assertEquals("Sheldon", DoubleCola.WhoIsNext(names, 6));
	}
	@Test
	public void test13(){
		assertEquals("Rajesh", DoubleCola.WhoIsNext(names, 13));
	}
	@Test
	public void test17(){
		assertEquals("Sheldon", DoubleCola.WhoIsNext(names, 17));
	}
	@Test
	public void test27(){
		assertEquals("Penny", DoubleCola.WhoIsNext(names, 27));
	}

}