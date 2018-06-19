package GenericTrees;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 3 20 2 50 0 60 0 30 2 70 0 80 2 110 0 120 0 40 1 100 0
		
		GenericTree tree = new GenericTree();
		
		System.out.println(tree.size());
		System.out.println(tree.sizee());
		System.out.println(tree.max());
		System.out.println(tree.find(110));
		System.out.println(tree.height());

	}

}
