package BinaryTree;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 true 2 true 4 true 8 false false true 9 false false true 5 true 10
		// true 12 false false true 13 false false true 11 true 14 true 16 false
		// false true 17 true 20 true 22 false false true 23 false false true 21
		// false false true 15 true 18 false false true 19 false false true 3
		// true 6 false false true 7 false false

		// 50 true 25 true 12 false false true 37 true 30 false false true 40 false false true 75 true 60 true 55 false false true 65 false false true 87 false false
		// BinaryTrees bt = new BinaryTrees();
		// bt.display();
		// System.out.println("MAX : "+ bt.max());
		// System.out.println("SIZE : "+ bt.size2());
		// System.out.println("FIND : "+bt.find(87));
		// System.out.println("HEIGHT : "+bt.height());
		//
		System.out.println("---------------------------");
		// bt.removeLeaves();
		// bt.display();
		// bt.singleChild();

		// ArrayList<Integer> ab = bt.nodeToRoot(40);
		// System.out.println(ab);

		// bt.targetSumroottoLeaf(150, 250);
		// bt.dataFromNtoK(3, 14);
	//	int[] preorder = { 50, 25, 12, 51, 32, 55, 75, 62, 87 };
		//int[] inorder = { 12, 25, 32, 51, 55, 50, 62, 75, 87 };
		// int [] postorder={12,32,55,51,25,62,85,75,50};
		//
	//	BinaryTrees bt = new BinaryTrees(preorder, inorder);
		 BinaryTrees bt = new BinaryTrees();
		bt.display();

		bt.preo();
		System.out.println();
		bt.preIt();
		
		System.out.println("---------");
		bt.ino();
		System.out.println("---------");
		bt.inIt();
		
		
		System.out.println("---------");
		bt.posto();
		System.out.println("---------");
		bt.postIt();
		
		
		// bt.levelOrder();
		// bt.PrintBinaries(10);
		// System.out.println(bt.diameter());
		// System.out.println(bt.diameterSmart());
		// System.out.println(bt.isBalanced());

		// System.out.println(bt.isBst());
	}

}
