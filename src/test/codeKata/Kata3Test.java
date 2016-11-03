package test.codeKata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.codeKata.Kata3;

public class Kata3Test {

	private Kata3 kata3;

	@Before
	public void setup() {
		kata3 = new Kata3();
	}

	// (expected = IllegalArgumentException.class)

	@Test
	public void testNull() {
		try {
			boolean success = kata3.verify(null);
		} catch (IllegalArgumentException e) {
			assertEquals(kata3.fail1, e.getMessage());
		}
	}

	@Test
	public void testEmpty() {
		try {
			boolean success = kata3.verify("");
		} catch (IllegalArgumentException e) {
			assertEquals(kata3.fail2, e.getMessage());
		}
	}

	@Test
	public void testLessThan8() {
		try {
			boolean success = kata3.verify("asdBNM7");
		} catch (IllegalArgumentException e) {
			assertEquals(kata3.fail2, e.getMessage());
		}
	}

	@Test
	public void testNoUppercase() {
		try {
			boolean success = kata3.verify("ldfasdlfajsdlfajsdf");
		} catch (IllegalArgumentException e) {
			assertEquals(kata3.fail3, e.getMessage());
		}
	}

	@Test
	public void testNoLowerCase() {
		String message = "";
		try {
			boolean success = kata3.verify("DFSKFJDSLFSDJF");
		} catch (IllegalArgumentException e) {
			message = e.getMessage();
		}
		assertEquals(kata3.fail4, message);
		System.out.println(kata3.fail4);
		System.out.println(message);
	}

	@Test
	public void testNoNum() {
		try {
			boolean success = kata3.verify("lkjDFDSFDSF");
		} catch (IllegalArgumentException e) {
			assertEquals(kata3.fail5, e.getMessage());
		}
	}

}
