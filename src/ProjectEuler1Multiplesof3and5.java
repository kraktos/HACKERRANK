import java.util.Scanner;

/**
 * 
 */

/**
 * @author adutta
 *
 */
public class ProjectEuler1Multiplesof3and5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int testCases = in.nextInt();
		long[] values = new long[testCases];
		int cc = 0;
		while (cc < testCases) {
			values[cc++] = in.nextLong();
		}

		for (long value : values) {
			System.out.println(getResult(value));
		}

	}

	private static long getResult(long input) {
		long value = 0;
		for (long ctr = 1; ctr < input; ctr++) {
			if (ctr % 3 == 0 || ctr % 5 == 0)
				value = value + ctr;

		}
		return value;
	}

}
