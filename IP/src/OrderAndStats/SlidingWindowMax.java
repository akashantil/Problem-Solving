package OrderAndStats;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SlidingWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++)
			arr[i] = sc.nextInt();
		
		int k=sc.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<k;i++){
			pq.add(arr[i]);
		}
		int j=0;
		for(int i=1;i<=arr.length-k;i++){
			int x=pq.peek();
			System.out.println(x);
			pq.remove(arr[j]);
			
			pq.add(arr[j+k]);
			j++;
		}
		System.out.println(pq.peek());

	}

}
