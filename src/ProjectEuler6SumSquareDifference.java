import java.util.Scanner;

/**
 * 
 */

/**
 * @author adutta
 *
 */
public class ProjectEuler6SumSquareDifference {

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

	private static long getResult(long value) {
		long sum = 0;
		long sq = (value * (value + 1) / 2);
		sq = sq * sq;

		for (int i = 1; i <= value; i++) {
			sum = sum + i * i;
		}
		return sq - sum;
	}

}
