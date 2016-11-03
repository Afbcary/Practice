package test;

import org.junit.Test;

import main.MainClass;

public class MainClassTest {

	@Test
	public void testMain() {
		MainClass main = new MainClass();
		MainClass.main(new String[1]);

	}
}
