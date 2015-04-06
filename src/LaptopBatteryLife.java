import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author adutta
 *
 */
public class LaptopBatteryLife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int MAXN = 1000;
		int n = 0;
		double[] x = new double[MAXN];
		double[] y = new double[MAXN];
		double sumx = 0.0, sumy = 0.0, sumx2 = 0.0;

		// -read from filePooped with Scanner class
		Scanner inputStream;
		try {
			inputStream = new Scanner(new File(
					"/Users/adutta/git/HACKERRANK/trainingdata.txt"));

			// hashNext() loops line-by-line
			while (inputStream.hasNext()) {
				// read single line, put in string
				String data = inputStream.next();

				// System.out.println(data);

				x[n] = Double.valueOf(data.split(",")[0]);
				y[n] = Double.valueOf(data.split(",")[1]);
				// System.out.println(x[n] +"\t"+ y[n]);
				sumx += x[n];
				sumx2 += x[n] * x[n];
				sumy += y[n];
				n++;

			}
			// after loop, close scanner
			inputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// first pass: read in data, compute xbar and ybar

		double xbar = sumx / n;
		double ybar = sumy / n;

		System.out.println(xbar + "\t" + ybar);
		// second pass: compute summary statistics
		double xxbar = 0.0, yybar = 0.0, xybar = 0.0;
		for (int i = 0; i < n; i++) {
			xxbar += (x[i] - xbar) * (x[i] - xbar);
			yybar += (y[i] - ybar) * (y[i] - ybar);
			xybar += (x[i] - xbar) * (y[i] - ybar);
		}
		double beta1 = xybar / xxbar;
		double beta0 = ybar - beta1 * xbar;
		System.out.println(beta0 + "\t" + beta1);

		// test model
		Scanner in = new Scanner(System.in);
		double timp_incarcare = in.nextDouble();

		System.out.println(2.870541111621019 + timp_incarcare*0.7295558470104919);
	}

}
