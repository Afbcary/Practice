package main;

import java.math.BigInteger;
import java.util.ArrayList;

import main.projectEuler.CoinSums;
import main.projectEuler.LargestPrimeFactor;
import main.projectEuler.LargestProductOfNConsecutive;
import main.projectEuler.NthPrime;
import main.projectEuler.NumberOfDivisors;
import main.projectEuler.Palindrome;
import main.projectEuler.PrimeFactorization;
import main.projectEuler.SmallestMultiple;
import main.projectEuler.SpecialPythagoreanTriplet;
import main.projectEuler.SumOfPrimesUpToN;
import main.projectEuler.SumSquareDifference;
import main.projectEuler.TriangleNumberCalculator;

public class MainClass {

	public static void main(String[] args) {
		// runLargestPrimeFactor(600851475143L);
		// runCheckIsPalindrome(6116);
		// run4();
		// findSmallestMultiple(20);
		// findSumSquareDifference(100L);
		// findNthPrime(10);
		// findLargestProductOfNConsecutive(13);
		// findSpecialPythagoreanTriplet();
		// findSumOfPrimesUpToN(2000000);
		findTriangleNumberWithGreaterThanNDivisors(new BigInteger("1000000000"));
		findCoinSums();

	}

	private static void findCoinSums() {
		CoinSums coinSums = new CoinSums();
		System.out.println(coinSums.getSum());

	}

	private static void findTriangleNumberWithGreaterThanNDivisors(BigInteger n) {
		TriangleNumberCalculator triangleNumberCalculator = new TriangleNumberCalculator();
		BigInteger result = triangleNumberCalculator.getTriangleNumber(n);
		System.out.println("Triangle number of " + n + " : " + result);
		PrimeFactorization primeFactorization = new PrimeFactorization();
		ArrayList<Integer> pF = primeFactorization.getPrimeFactorization(result);
		System.out.println("prime factors: " + pF);
		NumberOfDivisors numberOfDivisors = new NumberOfDivisors();
		int num = numberOfDivisors.getNumberOfDivisors(pF);
		System.out.println("number of divisors: " + num);

		// ArrayList<Integer> test = new ArrayList<Integer>();
		// test.add(2);
		// test.add(2);
		// test.add(2);
		// test.add(3);
		// test.add(5);
		// test.add(5);
		// test.add(7);
		// System.out.println(test);
		// int num2 = numberOfDivisors.getNumberOfDivisors(test);
		// System.out.println("number of divisors: " + num2);
	}

	private static void findSumOfPrimesUpToN(int i) {
		SumOfPrimesUpToN sumOfPrimesUpToN = new SumOfPrimesUpToN();
		System.out.println("ancient sieve");
		System.out.println(sumOfPrimesUpToN.ancientSieveOfEratosthenes(i));
		// System.out.println(sumOfPrimesUpToN.findSumOfPrimesUpToN(i));
	}

	private static void findSpecialPythagoreanTriplet() {
		SpecialPythagoreanTriplet specialPythagoreanTriplet = new SpecialPythagoreanTriplet();
		specialPythagoreanTriplet.getSpecialPythagoreanTriplet();

	}

	private static void findLargestProductOfNConsecutive(int input) {
		LargestProductOfNConsecutive largestProductOfNConsecutive = new LargestProductOfNConsecutive();
		System.out.println("product: " + largestProductOfNConsecutive.findLargestProductofNConsecutiveNumbers(input));

	}

	private static void findNthPrime(int input) {
		NthPrime nthPrime = new NthPrime();
		int prime = nthPrime.findNthPrime(input);
		System.out.println(input + "-prime: " + prime);

	}

	private static void runLargestPrimeFactor(long input) {
		LargestPrimeFactor lpf = new LargestPrimeFactor(input);
		lpf.generateFactors();
		lpf.findLPF();
		System.out.println("Largest prime factor equals: " + lpf.getLpf());
	}

	private static void runCheckIsPalindrome(int input) {
		Palindrome palindrome = new Palindrome();
		System.out.println(input + " is palindrome is " + palindrome.isPalindrome(input));
		// PalindromeMathApproach pma = new PalindromeMathApproach(9, 9, 9, 9, 9, 9);
	}

	private static void run4() {
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.findLargestPalindromeProductOfAPairOfThreeDigitNumbers());
	}

	private static void findSmallestMultiple(int input) {
		SmallestMultiple smallestMultiple = new SmallestMultiple();
		// System.out.println("Is 2520 a multiple of numbers 10 and less? " + smallestMultiple.isMultiple(2520, 10));
		// System.out.println("The least common multiple of 9 and 6 is " + smallestMultiple.findCommonMuliple(3, 2));
		// System.out.println(smallestMultiple.inefficientFactorialFinder(5));
		// System.out.println(smallestMultiple.doIt(20));

		System.out.println(smallestMultiple.findMultipleofAllUnder(20));

		// System.out.println(smallestMultiple.findCommonMuliple(20, 19));
	}

	private static void findSumSquareDifference(long input) {
		SumSquareDifference sumSquareDifference = new SumSquareDifference();
		System.out.println();
		System.out.println("Sum Square Difference: " + sumSquareDifference.getSumSquareDifference(input));
	}
}
