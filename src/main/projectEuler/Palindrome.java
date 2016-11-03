package main.projectEuler;

public class Palindrome {

	public boolean isPalindrome(int input) {
		String inputString = String.valueOf(input);
		if (inputString.length() < 2) {
			return true;
		}
		if (inputString.length() % 2 == 0) {
			return checkEvenLength(inputString);
		} else {
			return checkOddLength(inputString);
		}

	}

	private boolean checkOddLength(String inputString) {
		String inputWithMiddleCharRemoved = inputString.substring(0, inputString.length() / 2) + inputString.substring((inputString.length()) / 2 + 1);
		return checkEvenLength(inputWithMiddleCharRemoved);

	}

	private boolean checkEvenLength(String inputString) {
		if (inputString.length() < 2) {
			return true;
		}
		if (inputString.charAt(0) == inputString.charAt(inputString.length() - 1)) {
			return inputString.length() == 2 ? true : checkEvenLength("" + inputString.substring(1, inputString.length() - 1));
		}
		return false;
	}

	public int findLargestPalindromeProductOfAPairOfThreeDigitNumbers() {
		for (int i = 998001; i > 10000; i--) {
			if (isPalindrome(i)) {
				if (isProductOfAPairOfThreeDigitNumbers(i)) {
					return i;
				}
			}
		}
		return 1;
	}

	private boolean isProductOfAPairOfThreeDigitNumbers(int input) {
		for (int i = 999; i > 99; i--) {
			if (input % i == 0 && (input / i) > 99 && (input / i) < 1000) {
				System.out.println("factor 1: " + i);
				System.out.println("factor 1: " + input / i);
				return true;
			}
		}
		return false;
	}
}
