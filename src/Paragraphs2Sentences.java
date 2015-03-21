import java.util.Scanner;

/**
 * 
 */

/**
 * @author adutta
 *
 */
public class Paragraphs2Sentences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[]sentenceHolder = in.nextLine().split("(?<=[.!?])\\s* ");
		for(String sent : sentenceHolder){
			System.out.println(sent);
		}
	}
}
