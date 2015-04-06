import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class DiwaliLights {

	private static BigInteger retArr[];

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();

		retArr = new BigInteger[noOfCases];
		int cc = 0;
		while (cc < noOfCases) {
			solve(in.nextInt(), cc++);
		}

		for (BigInteger input : retArr) {
			System.out.println(input);

		}
	}

	private static void solve(int number, int testCaseNumr) {

		BigInteger big = BigInteger.valueOf(2).pow((int) number)
				.subtract(BigInteger.ONE).mod(new BigInteger("100000"));

		retArr[testCaseNumr] = big;

	}

}
