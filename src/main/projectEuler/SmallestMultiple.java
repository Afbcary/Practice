package main.projectEuler;

public class SmallestMultiple {

	// test value
	public boolean isMultiple(int input, int maxdivisor) {
		for (int i = 1; i <= maxdivisor; i++) {
			if (input % maxdivisor != 00) {
				return false;
			}
			System.out.println(input + "/" + i + "=" + input / i);
		}
		return true;
	}

	// create value from x inputs: 1-x
	public int findMultipleofAllUnder(int input) {
		int answer = input;
		for (int i = input - 1; i > 2; i--) {
			answer = findCommonMuliple(answer, i);
			System.out.println(answer);
		}
		return answer;
	}

	public int inefficientFactorialFinder(int input) {
		int factorial = 1;
		while (input > 1) {
			factorial *= input--;
		}
		return factorial;
	}

	// creates value from two inputs
	public int findCommonMuliple(int val1, int val2) {
		return findLeastCommonMultiple(val1, 1, val2, 1);
	}

	private int findLeastCommonMultiple(int val1, int fac1, int val2, int fac2) {
		if (val1 * fac1 == val2 * fac2) {
			return val1 * fac1;
		}
		if (val2 * fac2 >= val1 * val2) {
			return val1 * val2;
		}
		if (val1 * fac1 >= val1 * val2) {
			return findLeastCommonMultiple(val1, 0, val2, fac2 + 1);
		}
		return findLeastCommonMultiple(val1, fac1 + 1, val2, fac2);
	}
}
