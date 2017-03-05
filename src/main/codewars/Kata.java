package main.codewars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.Lists;

public class Kata {
	public static int[] DataReverse(int[] data) {

		List<Integer> integers = new ArrayList<>();
		for (int i : data) {
			integers.add(i);
		}

		List<List<Integer>> partitions = Lists.partition(integers, 8);
		partitions = Lists.reverse(partitions);
		Integer[] array = partitions.stream().flatMap(Collection::stream).toArray(Integer[]::new);

		int[] result = new int[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
}
