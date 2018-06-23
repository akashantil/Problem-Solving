package BinaryTree;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 50 true 25 true 12 false false true 37 true 30 false false true 40 false false true 75 true 60 true 55 false false true 65 false false true 87 false false
		BinaryTrees bt = new BinaryTrees();
		bt.display();
//		System.out.println("MAX    : "+ bt.max());
//		System.out.println("SIZE   : "+ bt.size2());
//		System.out.println("FIND   : "+bt.find(87));
//		System.out.println("HEIGHT : "+bt.height());
//		
//		System.out.println("---------------------------");
//		bt.removeLeaves();
//		bt.display();
//		bt.singleChild();
		
//		ArrayList<Integer> ab = bt.nodeToRoot(40);
//		System.out.println(ab);
		
		bt.targetSumroottoLeaf(150, 250);
		
	}

}
