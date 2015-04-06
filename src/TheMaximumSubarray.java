import java.util.Scanner;

public class TheMaximumSubarray {

	private static int array[];
	private static int arrayNeg[];
	private static int length;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();

		array = new int[noOfCases];
		arrayNeg = new int[noOfCases];

		int cc = 0;
		while (cc < noOfCases) {
			int elements = in.nextInt();
			int[] arr = new int[elements];
			for (int ctr = 0; ctr < elements; ctr++) {
				arr[ctr] = in.nextInt();
			}
			solve(arr, cc);
			solve2(arr, cc);
			cc++;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " " + arrayNeg[i]);
		}

	}

	private static void solve2(int[] arr, int testCaseNumr) {
		int sum = 0;
		int sumNeg = -Integer.MAX_VALUE;
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] > 0) {
				sum = sum + arr[idx];
			} else {
				if (arr[idx] > sumNeg) {
					sumNeg = arr[idx];
				}
			}
		}
		arrayNeg[testCaseNumr] = (sum == 0) ? sumNeg : sum;
	}

	private static void solve(int[] arr, int testCaseNumr) {
		int currentSum = 0;
		int bestSum = Integer.MIN_VALUE;

		int val = 0;
		for (int idx = 0; idx < arr.length; idx++) {
			val = currentSum + arr[idx];
			if (val > currentSum)
				currentSum = val;
			else
				currentSum = 0;

			if (currentSum > bestSum)
				bestSum = currentSum;
		}

		array[testCaseNumr] = bestSum;
	}

}
