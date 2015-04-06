import java.io.IOException;
import java.util.Scanner;

public class SherlockAndSquares {
	private static int array[];

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();

		int[] arr = new int[2];
		array = new int[noOfCases];
		int cc = 0;
		while (cc < noOfCases) {
			for (int ctr = 0; ctr < 2; ctr++) {
				arr[ctr] = in.nextInt();
			}
			solve(arr, cc);
			cc++;
		}

		for (int input : array) {
			System.out.println(input);

		}
	}

	private static void solve(int[] arr, int testCaseNumr) {
		int val = 0;
		int start = arr[0];
		int end = arr[1];

		int sqrRootStart = (int) Math.ceil(Math.sqrt(start));
		int sqrRootEnd = (int) Math.floor(Math.sqrt(end));

		array[testCaseNumr] = sqrRootEnd - sqrRootStart + 1;

	}

}
