package main.projectEuler;

import java.math.BigInteger;

public class TriangleNumberCalculator {

	public BigInteger getTriangleNumber(BigInteger input) {
		// xn = n(n+1)/2
		return input.multiply(input.add(BigInteger.ONE)).divide(new BigInteger("2"));
	}
}
