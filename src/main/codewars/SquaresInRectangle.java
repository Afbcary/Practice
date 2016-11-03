package main.codewars;

import java.util.ArrayList;
import java.util.List;

public class SquaresInRectangle {

	public static List<Integer> sqInRect(int length, int width) {
		if (length == width) {
			return null;
		}
		int remainingLength = length;
		int remainingWidth = width;
		List<Integer> sizeOfSquares = new ArrayList<>();
		int min = 0;
		while (remainingLength > 0) {
			// find the shorter of the two dimensions 'min'
			// remove the min from the longer dimension
			if (remainingLength < remainingWidth) {
				min = remainingLength;
				remainingWidth -= min;
			} else {
				min = remainingWidth;
				remainingLength -= min;
			}
			// add square of that size to sizeOfSquares
			sizeOfSquares.add(min);
		}
		return sizeOfSquares;
	}
}
