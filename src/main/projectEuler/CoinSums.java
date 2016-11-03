package main.projectEuler;

public class CoinSums {

	private int[] penceAmounts = { // except 200
			100,
			50,
			20,
			10,
			5,
			2,
			1
	};

	public int getSum() {
		int total = 0;
		int count = 0;
		for (int primary : penceAmounts) {
			total = primary;
			for (int secondary : penceAmounts) {
				total += secondary;
				if (total == 200) {
					count++;
				}
				if (total < 200) {

				}
			}
		}
		// not handling 200 case
		return count + 1;
	}

}
