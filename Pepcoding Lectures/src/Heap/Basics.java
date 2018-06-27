package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Basics {

	public static class Cars implements Comparable<Cars> {

		int speed;
		String name;
		int price;

		public Cars(int speed, int price, String name) {
			this.speed = speed;
			this.price = price;
			this.name = name;

		}

		@Override
		public int compareTo(Cars o) {
			// TODO Auto-generated method stub
			return this.speed - o.speed;
		}

		public String toString() {
			return "Speed : " + this.speed + ", Price : " + this.price + " , Name : " + this.name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cars[] cars = new Cars[5];
//		cars[0] = new Cars(100, 1000, "A");
//		cars[1] = new Cars(90, 1200, "B");
//		cars[2] = new Cars(120, 800, "C");
//		cars[3] = new Cars(50, 500, "D");
//		cars[4] = new Cars(110, 2800, "E");
//
//		Arrays.sort(cars);
//
//		for (Cars c : cars)
//			System.out.println(c);

		int[] arr = { 15, 7, 9, 5, 17, 20, 34, 43, 12, 10 };
		int k = 3;

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);

		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] < pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		

		while (!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");

		}

	}

}
