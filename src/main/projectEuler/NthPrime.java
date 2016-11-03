package main.projectEuler;

public class NthPrime {

	public int findNthPrime(int input) {
		int primeCount = 1;
		int curr = 1;
		boolean prime = true;
		while (primeCount < input) {
			curr += 2;
			prime = true;
			for (int i = 2; i < curr; i++) {
				if (curr % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				primeCount++;
				System.out.println(primeCount + "-prime: " + curr);
			}
		}
		return curr;

	}

}
