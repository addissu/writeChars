
public class WriteChars {

	public static void main(String[] args) {

		writeChars(1);
		System.out.println();
		writeChars(2);
		System.out.println();
		writeChars(3);
		System.out.println();
		writeChars(4);
		System.out.println();
		writeChars(5);
		System.out.println();
		writeChars(6);
		System.out.println();
		writeChars(7);
		System.out.println();
		writeChars(8);
		System.out.println();

	}

	public static void writeChars(int n) {

		if (n < 1) {
			throw new IllegalArgumentException("Less than 1");
			// base case #1
		}
		if (n == 1) {
			System.out.print("*");
			// base case #2
		} else if (n == 2) {
			System.out.print("**");

		}
		// if the two base cases aren't met, print <, minus 2 and > until
		// one of the base cases are met
		else {
			System.out.print("<");
			writeChars(n - 2);
			System.out.print(">");

		}

	}

}
