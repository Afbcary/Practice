package main;

public class OvertimePay {

	public double payPrimitive(double salary, int hours) {
		return salary * (8 * (hours / 8) + 1.5 * (hours % 8));
	}

	public double paywithMATH(double salary, int hours) {
		double pay = 0.0;
		int overtime = hours - 8;
		overtime = Math.max(overtime, 0);

		pay = (salary * (hours - overtime)) + ((salary * 1.5) * overtime);

		return pay;
	}

	public double payWithWhile(double salary, int hours) {
		double pay = 0.0;

		while (hours > 8) {
			pay += salary * 1.5;
			hours--;
		}

		pay += salary * hours;

		return pay;
	}

	public double payWithIf(double salary, int hours) {
		double pay = 0.0;
		if (hours > 8) {
			pay += salary * 1.5 * (hours - 8);
			hours = 8;
		}

		return pay + salary * hours;
	}
}
