package MedianPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMedian {

	PriorityQueue<Integer> max = new PriorityQueue<>();
	PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());

	private int size;

	public void add(int ele) {
		add(ele, max, min);

	}

	private void add(int ele, PriorityQueue<Integer> max, PriorityQueue<Integer> min) {

		int sdiff = Math.abs(max.size() - min.size());

		this.size++;

		if (max.size() == 0)
			max.add(ele);
		else if (min.size() == 0)
			min.add(ele);
		else {

			int minofmax = max.peek();
			int maxofmin = min.peek();

			if (sdiff == 0) {

				if (ele >= minofmax)
					max.add(ele);

				else
					min.add(ele);

			} else {
				if (min.size() - max.size() == 1) {
					if (ele >= maxofmin) {
						max.add(ele);
					} else {
						min.add(ele);
						min.remove();
						max.add(maxofmin);
					}
				} else {
					if (ele < minofmax) {
						min.add(ele);
					}

					else {
						max.remove();
						max.add(ele);
						min.add(minofmax);
					}
				}

			}
		}

	}

	public int peek() {
		return peek(max, min);
	}

	private int peek(PriorityQueue<Integer> max, PriorityQueue<Integer> min) {
		
		
		if (max.size() == min.size()) {
			return max.peek();
		} else if (max.size() - min.size() == 1) {
			return max.peek();
		} else
			return min.peek();
	}

	public int remove() {
		return remove(max, min);

	}

	private int remove(PriorityQueue<Integer> max, PriorityQueue<Integer> min) {
		
		if(this.size()==0)
			return -1;
			
			
		this.size--;
		

		if (max.size() == min.size()) {
			return max.remove();
		} else if (max.size() - min.size() == 1) {
			return max.remove();
		} else
			return min.remove();

	}

	private int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
}
