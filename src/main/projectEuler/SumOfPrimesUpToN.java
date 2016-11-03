package main.projectEuler;

import java.util.Arrays;

public class SumOfPrimesUpToN {

	// https://programmingpraxis.files.wordpress.com/2012/09/primenumbers.pdf
	public int findSumOfPrimesUpToN(int input) {
		// sum starts at 1 because the first recorded prime is 1 and 2 is skipped. Technically 2 is the first prime
		int sum = 1;
		int curr = 1;
		boolean prime = true;
		while (curr < input) {

			prime = true;
			for (int i = 3; i < curr / 2 && prime == true; i += 2) {
				if (curr % i == 0) {
					prime = false;
				}
			}
			if (prime) {
				sum += curr;
			}
			curr += 2;
		}
		System.out.println(curr);
		return sum;

	}

	public int ancientSieveOfEratosthenes(int n) {
		// 1
		boolean[] b = new boolean[2_000_000];
		Arrays.fill(b, true);
		int p = 2;
		int i = 0;
		int sum = 0;
		// 2
		while (p < n) {
			// 3
			if (b[p]) {
				// TODO : this is a modification of the algorithm to calculate the sum of primes up to n
				sum += p;
				// TODO : end modification
				i = p + p;
				// 4
				do {
					if (i < n) {
						b[i] = false;
					}
					i = i + p;
				} while (i <= n);
			}
			// 5
			p++;

		}

		return sum;
	}
}
