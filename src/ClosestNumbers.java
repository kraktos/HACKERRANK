import java.io.IOException;
import java.util.Scanner;

public class ClosestNumbers {

	private static int array[];
	private static int retArr[];
	private static int length;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int noOfCases = in.nextInt();

		int[] arr = new int[noOfCases];
		retArr = new int[noOfCases+2];
		int cc = 0;
		while (cc < noOfCases) {
			arr[cc] = in.nextInt();
			cc++;
		}
		sort(arr);

		solve(arr, cc);

		for (int input : retArr) {
			if (input != 0)
				System.out.print(input + " ");

		}
	}

	private static void solve(int[] arr, int testCaseNumr) {
		int diff = 0;
		int temp = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 1;) {
			diff = Math.abs(arr[i + 1] - arr[i]);
			if (diff <= temp)
				temp = diff;
			i++;
		}

		int k = 0;
		for (int i = 0; i < arr.length - 1;) {
			if (Math.abs(arr[i] - arr[i + 1]) == temp) {
				retArr[k++] = arr[i];
				retArr[k++] = arr[i + 1];
			}
			i++;
		}
	}

	public static void sort(int[] inputArr) {

		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}

	private static void quickSort(int lowerIndex, int higherIndex) {

		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

	private static void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
