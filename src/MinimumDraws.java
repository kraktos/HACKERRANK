import java.io.IOException;
import java.util.Scanner;

public class MinimumDraws {

	private static int retArr[];

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();

		retArr = new int[noOfCases];
		int cc = 0;
		while (cc < noOfCases) {
			solve(in.nextInt(), cc++);
		}

		for (int input : retArr) {
			System.out.println(input);

		}
	}

	private static void solve(int number, int testCaseNumr) {

		retArr[testCaseNumr] = number + 1;

	}

}
