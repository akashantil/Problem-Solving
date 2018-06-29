package Trie;

import java.util.ArrayList;
import java.util.HashMap;

public class Tries {

	public class Node {

		Character data;
		HashMap<Character, Node> child = new HashMap<>();
		boolean end;

	}

	private int words;
	private Node root;
	private int nodes;

	public Tries() {
		this.root = new Node();
		this.words = 0;
		this.nodes = 1;
	}

	public boolean search(String ques) {
		return search(this.root, ques);

	}

	private boolean search(Node node, String ques) {
		if (ques.length() == 0) {
			return node.end;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		Node child = node.child.get(ch);
		if (child == null)
			return false;

		if (node.child.containsKey(ch)) {

			return search(child, ros);
		} else
			return false;
	}

	public void addNode(String ques) {
		addNode(this.root, ques);

	}

	private void addNode(Node node, String ques) {

		if (ques.length() == 0) {
			if (node.end == false) {
				node.end = true;
				this.words++;
			}
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		Node child = node.child.get(ch);
		if (child == null) {
			child = new Node();
			child.data = ch;
			node.child.put(ch, child);

			this.nodes++;

		}
		addNode(child, ros);

	}

	public void displayAllWords() {
		displayAllWords(this.root, "");

	}

	private void displayAllWords(Node node, String wsf) {

		ArrayList<Character> keys = new ArrayList<>(node.child.keySet());

		if (node.end) {
			System.out.println(wsf);

		}

		for (int i = 0; i < keys.size(); i++) {
			Character ch = keys.get(i);

			displayAllWords(node.child.get(ch), wsf + ch);

		}

	}

	public void removeWord(String word) {
		removeWord(this.root, word);

	}

	private void removeWord(Node node, String word) {

		if (word.length() == 0) {
			if (node.end == true) {
				node.end = false;
				words--;
			}
			return;
		}

		char ch = word.charAt(0);
		String row = word.substring(1);

		Node child = node.child.get(ch);

		if (child == null) {
			return;
		}

		removeWord(child, row);

		if (child.end == false && child.child.size() == 0) {
			node.child.remove(ch);
			this.nodes--;

		}

	}

	public void displayTrie() {

		displayTrie(this.root);
	}

	private void displayTrie(Node node) {

		ArrayList<Character> keys = new ArrayList<>(node.child.keySet());
		System.out.println(node.data + " -> " + keys);

		for (Character key : keys) {

			displayTrie(node.child.get(key));

		}

	}

}
