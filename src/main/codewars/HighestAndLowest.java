package main.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestAndLowest {

	public static String HighAndLow(String numbers) {
		List<String> list = Arrays.asList(numbers.split(" "));
		//@formatter:off
		int max = list
			           .stream()
			           .map(Integer::parseInt)
			           .max(Comparator.naturalOrder()).get();
		int min = list
					  .stream()
					  .map(Integer::parseInt)
					  .min(Comparator.naturalOrder()).get();
		//@formatter:on
		return max + " " + min;
	}
}