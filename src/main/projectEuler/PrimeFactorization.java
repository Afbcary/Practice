package main.projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

public class PrimeFactorization {

	public ArrayList<Integer> getPrimeFactorization(BigInteger result) {
		int n = result.intValue();
		System.out.println("length of result :" + result.toString().length());
		System.out.println("is n a valid int? : " + n);
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

}
