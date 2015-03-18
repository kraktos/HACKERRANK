import java.util.Scanner;

public class MarkAndToys {

	private static int array[];
	private static int length;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfToys = in.nextInt();
		int totalPrice = in.nextInt();

		int[] arr = new int[noOfToys];
		int cc = 0;
		while (cc < noOfToys) {
			arr[cc++] = in.nextInt();
		}

		sort(arr);

		long sum = 0;
		int ctr = 0;
		for (long input : array) {
			sum = sum + input;
			if (sum > totalPrice)
				break;
			else
				ctr++;
		}

		System.out.println(ctr);
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
