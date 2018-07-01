package BST;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] sa = {12,25,37,50,62,75,87};
		BinarySearchTree bst = new BinarySearchTree(sa);
		bst.display();
//		System.out.println(bst.max());
//		System.out.println(bst.min());
//		System.out.println(bst.find(87));
//		bst.printInrange(12, 75);
//		
//		System.out.println("----------");
//		
//		bst.replaceWithSum();
//		
//		bst.display();
//		
//		System.out.println();
//		System.out.println("*************");
//		bst.addNode(26);
//		bst.display();
		
//		bst.removeNode(50);
		System.out.println("*************");
//		bst.addNode(26);
//		bst.display();
		bst.addNode(30);
		bst.addNode(70);
		System.out.println("*************");
//		bst.display();
		
		
		System.out.println("*************");
		bst.removeNode(30);
		bst.removeNode(62);
		bst.removeNode(50);
		System.out.println("*************");
		bst.display();
		
		
		

	}

}
