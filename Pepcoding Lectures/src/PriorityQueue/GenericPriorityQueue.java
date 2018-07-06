package PriorityQueue;

import java.util.ArrayList;

public class GenericPriorityQueue<T extends Comparable<T>> {

	private ArrayList<T> list = new ArrayList<>();
	private boolean reverse = false;

	public GenericPriorityQueue() {

	}

	public GenericPriorityQueue(Boolean x) {
		this.reverse = x;

	}

	public GenericPriorityQueue(T[] arr) {
		for (T a : arr)
			list.add(a);
		for (int i = list.size() - 1; i >= 0; i--) {
			DownHeapify(i);
		}
	}

	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	public int size() {
		return this.list.size();
	}

	public T peek() {
		return list.get(0);
	}

	public void add(T ele) {

		list.add(ele);

		UpHeapify(list.size() - 1);

	}

	private void UpHeapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;

		if (myCompareTo(pi, ci) > 0) {
			swap(pi, ci);

			UpHeapify(pi);
		}

	}

	public T remove() {

		swap(0, list.size() - 1);

		T x = list.remove(list.size() - 1);

		DownHeapify(0);

		return x;

	}

	private void DownHeapify(int pi) {
		// TODO Auto-generated method stub

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int min = (pi);

		if (lci < list.size() && myCompareTo(lci, min) < 0)
			min = lci;

		if (rci < list.size() && myCompareTo(rci, min) < 0)
			min = rci;

		if (min != (pi)) {
			swap(min, pi);

			DownHeapify(min);
		}
	}

	private void swap(int i, int j) {
		T x = list.get(i);
		T y = list.get(j);
		list.set(i, y);
		list.set(j, x);

	}

	public void display() {
		System.out.println(list);
	}

	private int myCompareTo(int i, int j) {

		if (this.reverse == false) {

			return list.get(i).compareTo(list.get(j));
		} else {
			return list.get(j).compareTo(list.get(i));
		}

	}

	public void updateElement(T val){
		int idx=-1;
		
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(val)){
				idx=i;
				break;
			}
		}
		if(idx!=-1){
		this.UpHeapify(idx);
		this.DownHeapify(idx);
		}
		
		
	}

}
