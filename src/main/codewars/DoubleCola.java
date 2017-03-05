package main.codewars;

import java.util.ArrayList;
import java.util.List;

/*
 * This kata is only difficult for large values of n
 */
public class DoubleCola {
	public static String WhoIsNext(String[] names, int n) {
		List<Person> people = new ArrayList<>();
		for (String name : names) {
			people.add(new Person(name));
		}

		int counter = 0;
		Person current;
		while (true) {
			current = people.remove(0);
			counter += current.getQuantity();
			if (counter >= n) {
				return current.getName();
			}
			people.add(current.doubleQuantity());
		}
	}

	public static class Person {

		private final String name;
		private int quantity;

		public Person(String name) {
			this.name = name;
			this.quantity = 1;
		}

		public String getName() {
			return name;
		}

		public int getQuantity() {
			return quantity;
		}

		public Person doubleQuantity() {
			this.quantity *= 2;
			return this;
		}

	}
}
