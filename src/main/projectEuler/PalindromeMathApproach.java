package main.projectEuler;

public class PalindromeMathApproach {

	private int a, b, c, d, e, f, g, h, i, j, k, l;

	public PalindromeMathApproach(int a, int b, int c, int d, int e, int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;

		int threeDigitNum1 = a * 100 + b * 10 + c;
		int threeDigitNum2 = d * 100 + e * 10 + f;
		// System.out.println("multiplying " + threeDigitNum1 + " and " + threeDigitNum2);
		int product = threeDigitNum1 * threeDigitNum2;
		// System.out.println("product is : " + product);
		g = product / 100_000;
		product -= g * 100_000;
		h = product / 10_000;
		product -= h * 10_000;
		i = product / 1_000;
		product -= i * 1_000;
		j = product / 100;
		product -= j * 100;
		k = product / 10;
		product -= k * 10;
		l = product;
		System.out.println("ghijkl:      " + g + "" + h + "" + i + "" + j + "" + k + "" + l + "");

	}

	public boolean isPalindrome() {
		return g == l && h == k && i == j;
	}

}
