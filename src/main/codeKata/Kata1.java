package main.codeKata;

public class Kata1 {

	private int total = 0;
	private String delimiters = ",|//n";

	public int Add(String inputString) {
		if (inputString == null || inputString.length() == 0) { // add Apache common to use StringUtils
			return 0;
		}
		if (inputString.length() > 2 && inputString.substring(0, 2).equals("//")) {
			delimiters = delimiters + "|" + inputString.charAt(2);
		}

		String[] inputs = inputString.split("[" + delimiters + "]");

		for (String s : inputs) {
			if (s.length() > 0) {
				total += Integer.parseInt(s.trim());
			}
		}
		return total;
	}

}

// "//;\n1;2");