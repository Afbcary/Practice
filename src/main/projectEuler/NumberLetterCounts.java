package main.projectEuler;

// writing out numbers in compliance with British usage
public class NumberLetterCounts {

//@formatter:off
	// zero - indexed
	private static final String[] ONES = {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	private static final String[] TEENS = {"TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
	private static final String[] TENS = {"","TEN","TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};
	private static final String HUNDRED = "HUNDRED";
	private static final String THOUSAND = "THOUSAND";
	private static final String AND = "AND";
//@formatter:on
	public int getNumberOfLetters(int max) {
		int total = 0;
		for (int i = 1; i <= max; i++) {
			total += convertNumToString(numToOnesTensHundreds(i)).length();
		}
		return total;
	}

	public int[] numToOnesTensHundreds(int num) {
		int numHundreds = num / 100;
		int numTens = (num - numHundreds * 100) / 10;
		int numOnes = (num - numHundreds * 100 - numTens * 10);
		return new int[] {
				numHundreds,
				numTens,
				numOnes
		};
	}

	// not handling 1000 to improve performance
	public String convertNumToString(int[] numVals) {
		int numHundreds = numVals[0];
		int numTens = numVals[1];
		int numOnes = numVals[2];
		StringBuilder sb = new StringBuilder();
		if (numHundreds > 0) {
			sb.append(ONES[numHundreds] + HUNDRED + AND);
		}
		if (numTens > 0) {
			if (numTens == 1) {
				sb.append(TEENS[numOnes]);
				return sb.toString();
			}
			sb.append(TENS[numTens]);
		}
		sb.append(ONES[numOnes]);

		return sb.toString();
	}
}
