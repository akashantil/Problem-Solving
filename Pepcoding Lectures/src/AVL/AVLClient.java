package AVL;

public class AVLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sa = {12,25,37,50,62,75,87};
		Avl avl = new Avl(sa);
		
//		avl.display();
		
		avl.addNode(10);
		avl.addNode(5);
		
		
		
		System.out.println("***************");
		avl.display();

	}

}
