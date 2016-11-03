package main.projectEuler;

public class SpecialPythagoreanTriplet {

	private int a = 1;
	private int b = 2;
	private int c = 997;

	public void getSpecialPythagoreanTriplet() {
		while (b < 500) {
			if (doA2andB2EqualC2()) {
				break;
			}
			c--;
			a++;
			if (a == b) {
				a = 1;
				b++;
				c = 1000 - b - a;

			}
			System.out.println("a :" + a + " b: " + b + " c: " + c);
		}
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		System.out.println("a^2 + b^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)));
		System.out.println("c^2 = " + Math.pow(c, 2));

	}

	private boolean doA2andB2EqualC2() {
		return ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2));
	}
}
