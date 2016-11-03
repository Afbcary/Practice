package main.projectEuler;

public class SumSquareDifference {

	// calculate a, the sum of squares of the first n natural numbers
	// 1^2 + 2^2 + ... + n^2
	public long sumOfSquares(long input) {
		long total = 0;
		for (long i = 1; i <= input; i++) {
			total += i * i;

		}
		System.out.println("total: " + total);
		return total;
	}

	// calculate b, the square of the sum of the first n natural numbers
	// (1+2+...+n)^2
	public long squareOfTheSum(long input) {
		long sum = 0;
		for (long i = 1; i <= input; i++) {
			sum += i;
		}
		System.out.println("sum: " + sum);
		System.out.println("sum^2: " + (sum * sum));
		return sum * sum;
	}

	// calculate Sum square difference
	// b - a
	public long getSumSquareDifference(long input) {
		return squareOfTheSum(input) - sumOfSquares(input);
	}

}
