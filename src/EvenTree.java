import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenTree {

	static Map<Integer, Integer> MAP = new HashMap<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vertices = in.nextInt();
		int edges = in.nextInt();

		int[] nodes = new int[vertices + 1];

		int cc = 0;
		while (cc < edges) {
			int startNode = in.nextInt();
			int endNode = in.nextInt();

			recur(startNode, endNode, nodes);

			cc++;
		}
		int c = 0;
		for (int s : nodes) {
			if (s != 0) {
				if (s % 2 != 0) {
					c++;
				}
			}

		}
//		System.out.println(Arrays.toString(nodes));
		System.out.println(c - 1);

	}

	private static void recur(int startNode, int endNode, int[] nodes) {
		int start = 0;
		int end = 0;

		if (!MAP.containsKey(startNode)) {
			if (nodes[endNode] != 0) {
				nodes[endNode] = nodes[endNode] + 1;
			} else {
				nodes[endNode] = 1;
			}

			MAP.put(startNode, endNode);

			if (MAP.containsKey(endNode)) {
				start = endNode;
				end = MAP.get(endNode);
				recur(start, end, nodes);
			}
		} else {
			if (nodes[endNode] != 0) {
				nodes[endNode] = nodes[endNode] + 1;
			} else {
				nodes[endNode] = 1;
			}
			if (MAP.containsKey(endNode)) {
				start = endNode;
				end = MAP.get(endNode);
				recur(start, end, nodes);
			}
		}
	}
}
