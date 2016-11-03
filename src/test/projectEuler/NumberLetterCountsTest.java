package test.projectEuler;

import org.junit.Test;

import main.projectEuler.NumberLetterCounts;

public class NumberLetterCountsTest {

	private NumberLetterCounts nlc = new NumberLetterCounts();

	@Test
	public void testNumsToStrings() {
		System.out.println("342:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(342)));
		System.out.println("1:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(1)));
		System.out.println("25:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(25)));
		System.out.println("15:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(15)));
		System.out.println("946:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(946)));
		System.out.println("3:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(3)));
		System.out.println("1:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(1)));
		System.out.println("11:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(11)));
		System.out.println("111:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(111)));
		System.out.println("987:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(987)));
		System.out.println("35:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(35)));
		System.out.println("89:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(89)));
		System.out.println("53:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(53)));
		System.out.println("19:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(19)));
		System.out.println("101:" + nlc.convertNumToString(nlc.numToOnesTensHundreds(101)));
		System.out.println("num letters in 342: " + nlc.convertNumToString(nlc.numToOnesTensHundreds(342)).length());
		System.out.println("num letters in 115: " + nlc.convertNumToString(nlc.numToOnesTensHundreds(115)).length());
	}

	@Test
	public void testNumberRange() {
		System.out.println("num letters 1-5: " + nlc.getNumberOfLetters(5));
	}

	@Test
	public void giveMeTheAnswer() {
		System.out.println("one thousand is length: " + "ONETHOUSAND".length());
		System.out.println(nlc.getNumberOfLetters(999));
	}

}
