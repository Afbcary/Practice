package main.codewars;

import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {

	public static boolean scramble(String scramble, String goal) {
		return bruteForceIsScrambled(scramble, goal);
	}

	private static boolean bruteForceIsScrambled(String scramble, String goal) {
		char[] goalChars = goal.toCharArray();
		List<Character> scrambleChars = scramble.chars().mapToObj((i) -> Character.valueOf((char) i)).collect(Collectors.toList());
		for (char goalChar : goalChars) {
			if (!scrambleChars.remove(new Character(goalChar))) {
				return false;
			}
		}
		return true;
	}
}