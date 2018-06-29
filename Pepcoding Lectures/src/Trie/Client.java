package Trie;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tries tr= new Tries();
		
		tr.addNode("ant");
		tr.addNode("and");
		tr.addNode("an");
		tr.addNode("see");
		tr.addNode("seen");
		tr.addNode("seek");
		tr.addNode("sea");
//		System.out.println(tr.search("an"));
//		System.out.println(tr.search("act"));
		tr.displayAllWords();
		System.out.println("--------");
		tr.removeWord("and");
//		tr.removeWord("ant");
		tr.displayTrie();		

	}

}
