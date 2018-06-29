package HuffMan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class EncoderDecoder {

	public static class Node implements Comparable<Node> {
		char data;
		int freq;
		Node left;
		Node right;

		Node(char data, int freq, Node left, Node right) {
			this.data = data;
			this.freq = freq;
			this.left = left;
			this.right = right;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.freq - o.freq;
		}

	}

	HashMap<Character, String> encMAp = new HashMap<>();
	HashMap<String, Character> decMap = new HashMap<>();

	HashMap<Character, Integer> fmap = new HashMap<>();

	public EncoderDecoder(String inp) {

		for (int i = 0; i < inp.length(); i++) {
			char ch = inp.charAt(i);
			fmap.put(ch, fmap.containsKey(ch) ? fmap.get(ch) + 1 : 1);

		}

		PriorityQueue<Node> pq = new PriorityQueue<>();

		ArrayList<Character> keys = new ArrayList<>(fmap.keySet());

		for (int i = 0; i < keys.size(); i++) {
			char ch = keys.get(i);
			Node td = new Node(ch, fmap.get(ch), null, null);

			pq.add(td);

		}

		while (pq.size() > 1) {

			Node a = pq.remove();
			Node b = pq.remove();
			Node merged = new Node('-', a.freq + b.freq, a, b);

			pq.add(merged);

		}
		Node root = pq.remove();
		traverse(root, "");

	}

	private void traverse(Node node, String asf) {

		if (node.left == null && node.right == null) {
			encMAp.put(node.data, asf);
			decMap.put(asf, node.data);
			return;
		}

		traverse(node.left, asf + "0");
		traverse(node.right, asf + "1");

	}

	public String encoder(String input) {

		String output = "";

		for (int i = 0; i < input.length(); i++) {

			output = output + encMAp.get(input.charAt(i));

		}
		return output;
	}

	public String Decoder(String input) {
		String output = "";
		String key = "";

		for (int i = 0; i < input.length(); i++) {
			key = key + input.charAt(i) + "";
			if (decMap.containsKey(key)) {
				output = output + decMap.get(key);
				key = "";

			}

		}
		return output;
	}

}
