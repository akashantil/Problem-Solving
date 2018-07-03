package hashMap;

public class GEnericLLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericLInkedList<String> ll = new GenericLInkedList<>();
		ll.addLast("hello");
		ll.addLast("friends");
		ll.addLast("chai");
		ll.addLast("pilo");
		ll.removeAt(2);
		ll.removeAt(2);
		ll.removeAt(1);
		ll.removeAt(0);
		ll.display();

	}

}
