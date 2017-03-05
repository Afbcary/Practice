package main.codewars;


/**
 * @param names
 *            : a list of exactly 5 names
 * @param n
 *            : the name of the person who drinks the nth cola
 * @author Austin
 *
 */
public class DoubleCola {
	// public static String WhoIsNext(String[] names, int n) {
	// List<Integer> namesIndices = new ArrayList<Integer>(Arrays.asList(0, 1,
	// 2, 3, 4));
	//
	// for (int i = 0; namesIndices.size() < n; i++) {
	// Integer index = namesIndices.get(i);
	// namesIndices.add(index);
	// namesIndices.add(index);
	// }
	// return names[namesIndices.get(n - 1)];
	// }
	public static String WhoIsNext(String[] names, int n) {
		int multiplier = names.length;
		long multipleOfNumPeople = 1l;
		long total = multipleOfNumPeople * multiplier;
		long remainingPpl = n;
		while (total < n) {
			remainingPpl -= multipleOfNumPeople * multiplier;
			multipleOfNumPeople++;
			total += multipleOfNumPeople * multiplier;
		}
		int i = 1;
		while (true) {
			if (remainingPpl <= i * multipleOfNumPeople) {
				return names[i - 1];
			}
			i++;
		}

	}
}