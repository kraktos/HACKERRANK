import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		int[] arr = new int[testCases];
		int cc = 0;
		while (cc < testCases) {
			arr[cc++] = in.nextInt();
		}

		for (int input : arr) {
			String i = String.valueOf(input);
			long val = 0;

			for (int len = 0; len < i.length(); len++) {
				char c = i.charAt(len);
				String key = String.valueOf(c);
				int el = Integer.parseInt(key);
				if (el != 0 && input % el == 0) {
					val++;
				}
			}

			System.out.println(val);
		}
    }
}