package main.projectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

public class LargeSum {

	private ArrayList<BigInteger> allNums = new ArrayList<BigInteger>();

	public void populateAllNums(String input, int length) {
		while (input.length() > length) {
			allNums.add(new BigInteger(input.substring(0, 50)));
			input = input.substring(50);
		}
	}

	public int getAllNumsSize() {
		return allNums.size();
	}

	public String getSumAllNums() {
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < allNums.size(); i++) {
			sum.add(allNums.get(i));
		}
		return sum.toString();
	}

	public int getLengthOfOneNum(int index) {
		return allNums.get(index).toString().length();
	}

	public void printFirstNum() {
		System.out.println(allNums.get(0).toString());
	}
}
