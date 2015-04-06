import java.util.Scanner;

/**
 * 
 */

/**
 * @author adutta
 *
 */
public class ProjectEuler48SelfPowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = in.nextInt();
		long s = getResult(value);
		System.out.println(s);
		System.out.println(s % 1000000000 + "" );
	}

	private static long getResult(int value) {
		long sum = 0;
		for (int i = 1; i <= value; i++) {
			sum = sum + (long) Math.pow(i, i);
		}
		return sum;
	}

}
