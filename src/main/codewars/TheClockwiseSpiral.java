package main.codewars;

public class TheClockwiseSpiral {

	public static int[][] createSpiral(int N) {
		int[][] spiral = new int[N][N];
		int max = N * N;

		int ceiling, lWall = 0;
		int floor, rWall = N - 1;
		int currX, currY = 0;

		for (int numToPlace = 1; numToPlace <= max; numToPlace++) {

		}
		printSpiral(spiral);
		return spiral;
	}

	public static void printSpiral(int[][] spiral) {
		for (int[] row : spiral) {
			for (int point : row) {
				System.out.print(String.format("%d ", point));
			}
			System.out.println();
		}
	}

	public static void spiralAnimation(int[][] spiral) {
		// clear console
		System.out.print("\033\143");
	}

	public static int[][] recursiveSpiral(int N) {
		if (N == 1) {
			//@formatter:off
			return new int[][] {{1}};
			//@formatter:on
		}
		return null;
	}

	public class Tuple<X, Y> {

		public final X x;
		public final Y y;

		public Tuple(X x, Y y) {
			this.x = x;
			this.y = y;
		}
	}

}