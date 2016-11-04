package main.codewars;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseData {

	public static int[] DataReverse(int[] data) {
		List<int[]> list = Arrays.asList(data);
		Stream<List<int[]>> batches = batches(list, 8);
		//@formatter:off
		Object[] objArray = batches
										.sorted(Collections.reverseOrder())
										.flatMap(Collection::stream)
										.toArray();
		for (Object obj : objArray){
			System.out.println(obj);
		}
		//@formatter:on
		// Object[] array = Arrays.asList(objArray).stream().map(s -> ((Integer) s).intValue()).toArray();

		return data;
	}

	public static <T> Stream<List<T>> batches(List<T> source, int length) {
		if (length <= 0) {
			throw new IllegalArgumentException("length = " + length);
		}
		int size = source.size();
		if (size <= 0) {
			return Stream.empty();
		}
		int fullChunks = (size - 1) / length;
		return IntStream.range(0, fullChunks + 1).mapToObj(n -> source.subList(n * length, n == fullChunks ? size : (n + 1) * length));
	}

}
