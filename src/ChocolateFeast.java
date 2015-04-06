import java.util.Scanner;

public class ChocolateFeast {

	private static int array[];
	private static int length;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();

		int[] arr = new int[3];
		array = new int[noOfCases];
		int cc = 0;
		while (cc < noOfCases) {
			for (int ctr = 0; ctr < 3; ctr++) {
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
		int money = arr[0];
		int priceOfTruffle = arr[1];
		int M = arr[2];

		int extra = 0;
		int eats = 0;
		int wrappers = (money / priceOfTruffle);
		eats = wrappers;

		while (wrappers >= M) {
			val = wrappers / M;
			extra = extra + val;
			wrappers = val + (wrappers % M);
		}

		eats = eats + extra;
		array[testCaseNumr] = eats;
	}

}
