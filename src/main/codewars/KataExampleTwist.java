package main.codewars;

import java.util.Collections;

public class KataExampleTwist {
	public static String[] kataExampleTwist() {
		return Collections.nCopies(1000, "codewars").stream().toArray(String[]::new);
	}
}
