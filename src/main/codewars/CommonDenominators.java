package main.codewars;

public class CommonDenominators {

	private static final int NUMERATOR = 0;
	private static final int DENOMINATOR = 1;

	public static String convertFrac(long[][] lst) {
		// get leastCommonMultiple of denominators
		long newDenominator = lst[0][1];
		for (long[] fraction : lst) {
			newDenominator = LCMByReductionByTheGreatestCommonDivisor(newDenominator, fraction[DENOMINATOR]);
		}
		// convert numerators to remain correct fraction
		for (long[] fraction : lst) {
			fraction[NUMERATOR] = (fraction[NUMERATOR] * newDenominator) / fraction[DENOMINATOR];
			fraction[DENOMINATOR] = newDenominator;
		}
		// output string formatted as specified
		StringBuilder output = new StringBuilder();
		for (long[] fraction : lst) {
			output.append("(");
			output.append(fraction[NUMERATOR]);
			output.append(",");
			output.append(fraction[DENOMINATOR]);
			output.append(")");
		}
		return output.toString();
	}

	// private static long findLeastCommonMultiple(long newDenominator, long fraction) {
	// return findLeastCommonMultiple(newDenominator, 1, fraction, 1);
	// }
	//
	// private static long findLeastCommonMultiple(long val1, long fac1, long val2, long fac2) {
	// while (true) {
	// if (val1 * fac1 == val2 * fac2) {
	// return val1 * fac1;
	// }
	// if (val2 * fac2 >= val1 * val2) {
	// return val1 * val2;
	// }
	// if (val1 * fac1 >= val1 * val2) {
	// fac1 = 0;
	// fac2++;
	// }
	// fac1++;
	// }
	// }

	private static long LCMByReductionByTheGreatestCommonDivisor(long a, long b) {
		if (a == 0 && b == 0) {
			return 0;
		}
		return a * b / (greatestCommonDivisor(a, b));
	}

	private static long greatestCommonDivisor(long a, long b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}

}