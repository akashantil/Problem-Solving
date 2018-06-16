package DS.LinkedList;

public class CheckPalindromeLinkList extends Linkedlist {

	private static class HeapMover {
		node nodee;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linkedlist ll = new Linkedlist();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(50);
		ll.addLast(80);
		ll.addLast(30);
		ll.addLast(20);
		ll.addLast(10);
		HeapMover mover = new HeapMover();
		mover.nodee = ll.head;

		System.out.println(checkPalindrome(ll, mover, ll.head, 0));

	}

	private static boolean checkPalindrome(Linkedlist ll, HeapMover temp, node iter, int size) {

		if (iter == null)
			return true;

		boolean ans = checkPalindrome(ll, temp, iter.next, size + 1);
		if (ans == false)
			return false;
		if (size >= ll.size / 2) {
			if (iter.data != temp.nodee.data)
				return false;
			temp.nodee = temp.nodee.next;
		}

		return ans;

	}

}
