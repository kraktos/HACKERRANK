import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		long[] arr = new long[testCases];
		int cc = 0;
		while (cc < testCases) {
			arr[cc++] = in.nextLong();
		}

		for (long input : arr) {
			String i = String.valueOf(input);
			System.out.println(getHeight(input));

		}
    }
    
    
    private static long getHeight(long cycles) {
		long initialHeight = 1;
		long i = 1;
		if (cycles == 0)
			return initialHeight;
		else {
			while (i <= cycles) {
				if (i % 2 != 0) // even cycles
				{
					initialHeight = initialHeight * 2;
				} else // odd cycles
				{
					initialHeight = initialHeight + 1;
				}
				i++;
			}
		}
		return initialHeight;
	}
}