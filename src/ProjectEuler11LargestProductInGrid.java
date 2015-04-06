import java.util.Scanner;

/**
 * 
 */

/**
 * @author adutta
 *
 */
public class ProjectEuler11LargestProductInGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] array = new int[20][20];

		int rowCtr = 0;
		int colCtr = 0;
		while (rowCtr != 20) {
			int value = in.nextInt();
			array[rowCtr][colCtr++] = value;
			if (colCtr == 20) {
				rowCtr++;
				colCtr = 0;
			}
		}

		System.out.println(findDiagSum(array));

	}

	private static long findDiagSum(int[][] array) {
		long prod = 0;
		long temp = 0;
		
		for (int i = 0; i < 17; i++) {
			for (int j = 3; j < 20; j++) {
				prod = array[i][j] * array[i + 1][j - 1] * array[i + 2][j - 2]
						* array[i + 3][j - 3];
				if (prod > temp)
					temp = prod;
			}
		}
		
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17; j++) {
				prod = array[i][j] * array[i + 1][j + 1] * array[i + 2][j + 2]
						* array[i + 3][j + 3];
				if (prod > temp)
					temp = prod;
			}
		}

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 17; j++) {
				prod = array[i][j] * array[i][j + 1] * array[i][j + 2]
						* array[i][j + 3];
				if (prod > temp)
					temp = prod;
			}
		}

		for (int j = 0; j < 20; j++) {
			for (int i = 0; i < 17; i++) {
				prod = array[i][j] * array[i + 1][j] * array[i + 2][j]
						* array[i + 3][j];
				if (prod > temp)
					temp = prod;
			}
		}

		return temp;
	}

}
