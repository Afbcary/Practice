package main.projectEuler;

import java.util.ArrayList;

public class NumberOfDivisors {

	public int getNumberOfDivisors(ArrayList<Integer> primeFactors) {
		if (primeFactors == null || primeFactors.isEmpty()) {
			return 0;
		}
		int currentNumber = 0;
		int divisors = 2;
		int currentE = 1;
		for (Integer val : primeFactors) {
			if (val != currentNumber) {
				divisors *= currentE;
				currentNumber = val;
				currentE = 2;
			} else {
				currentE++;
			}
		}
		return divisors;
	}

}
