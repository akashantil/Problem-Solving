package C16June30;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();

		Deque<Integer> dq = new LinkedList<>();
		int i;
		for (i = 0; i < k; i++) {

			while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
				dq.removeLast();

			dq.addLast(i);
		}
		for(int i1=1;i1<k;i1++)
			System.out.print("_"+" ");

		for (; i < soa; ++i) {
			System.out.print(arr[dq.peek()] + " ");

			while (!dq.isEmpty() && dq.peek() <= i - k)
				dq.removeFirst();

			while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
				dq.removeLast();

			dq.addLast(i);
		}
		System.out.print(arr[dq.peek()]);

	}

}
