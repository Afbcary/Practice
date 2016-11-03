package main.projectEuler;

import java.util.ArrayList;
import java.util.Collections;

public class LargestPrimeFactor {

	private long input;
	private ArrayList<Long> factors = new ArrayList<Long>();
	private long lpf;

	public LargestPrimeFactor(long input) {
		this.setInput(input);
		this.lpf = 1;
	}

	public void generateFactors() {
		factors.add(input);
		for (long i = 2; i < factors.get(factors.size() - 1); i++) {
			if (input % i == 0) {
				factors.add(i);
				factors.add(input / i);
			}
		}
		Collections.sort(factors);
		Collections.reverse(factors);
		System.out.println("Factors, reverse sorted: " + factors);
	}

	public void findLPF() {
		boolean prime = true;
		for (long i : factors) {
			prime = true;
			for (int j = 2; j < (i / 2); j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				lpf = i;
				break;
			}
		}
	}

	public long getInput() {
		return input;
	}

	public void setInput(long input2) {
		this.input = input2;
	}

	public long getLpf() {
		return lpf;
	}

	public void setLpf(long lpf) {
		this.lpf = lpf;
	}

}
