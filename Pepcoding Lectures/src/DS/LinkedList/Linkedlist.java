package DS.LinkedList;

public class Linkedlist {

	public static class node {
		int data;
		node next;
	}

	protected node head;
	protected node tail;
	protected int size;

	public void addLast(int data) {

		node temp = new node();

		temp.data = data;

		if (size != 0) {
			tail.next = temp;
			tail = temp;

		}

		else {
			head = temp;
			tail = temp;

		}
		size++;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		node temp = head;

		for (int i = 0; i < size; i++) {
			System.out.print(temp.data + "->");
			temp = temp.next;

		}
		System.out.print(".");
		System.out.println();

	}

	public void addFirst(int data) {
		node temp = new node();
		temp.data = data;

		if (size != 0) {

			temp.next = head;

		} else {
			head = temp;

			tail = head;

		}
		head = temp;
		size++;

	}

	public void addAt(int data, int idx) {

		node iterator = head;
		node temp = new node();
		temp.data = data;

		if (idx < 0 || idx > size) {
			System.out.println("Invalid Index");
			return;
		}

		else if (idx == 0) {
			this.addFirst(data);
			return;
		} else if (idx == size) {
			this.addLast(data);
			return;
		}

		else {

			for (int i = 1; i < idx; i++) {
				iterator = iterator.next;
			}

			temp.next = iterator.next;
			iterator.next = temp;

			size++;
		}
	}

	public void removelast() {
		if (size == 0) {
			System.out.println("Empty list");
			return;
		} else if (size == 1) {
			head = null;
			tail = null;
			size = 0;
			return;
		}

		node temp = head;

		for (int i = 0; i < size - 2; i++) {
			temp = temp.next;

		}
		temp.next = null;
		tail=temp;

		size--;

	}

	public void removefirst() {

		if (size != 1)
			head = head.next;
		else
			head = null;
		size--;

	}

	public void removeAt(int idx) {

		if (size == 0) {
			System.out.println("Empty list");
			return;
		}

		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index");
			return;
		}

		if (idx == 0) {
			if (size != 1)
				head = head.next;
			else
				head = null;
			size--;

			return;

		}

		node iterator = head;

		for (int i = 1; i < idx; i++) {
			iterator = iterator.next;
		}
		iterator.next = iterator.next.next;

		size--;

	}

	public int getFirst() {

		if (size == 0) {
			System.out.println("Empty List");
			return -1;
		} else
			return head.data;
	}

	public int getLast() {

		if (size == 0) {
			System.out.println("Empty List");
			return -1;
		} else
			return tail.data;

	}

	public int getAt(int idx) {

		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index");
			return -1;
		} else {
			node temp = head;

			for (int i = 0; i < idx; i++) {
				temp = temp.next;

			}
			return temp.data;
		}

	}

	protected node getNodeAt(int idx) {
		node temp = head;
		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index");
			return null;
		} else {

			for (int i = 0; i < idx; i++) {
				temp = temp.next;

			}

		}
		return temp;

	}

}
