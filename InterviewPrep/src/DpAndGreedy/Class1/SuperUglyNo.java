package DpAndGreedy.Class1;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SuperUglyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();

		int[] primes = new int [soa];
		for(int i=0;i<soa;i++){
			primes[i]=sc.nextInt();
		}
		int[] indices = new int[primes.length];
		
		int n=sc.nextInt();

		int[] arr = new int[n + 1];
		arr[1]=1;

		for (int i = 0; i < primes.length; i++) {
			indices[i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for (int i1 = 0; i1 < primes.length; i1++) {
				int f = primes[i1] * arr[indices[i1]];
				pq.add(f);

			}
			int re = pq.remove();
			arr[i] = re;

			for (int i1 = 0; i1 < primes.length; i1++) {
				if (primes[i1] * arr[indices[i1]] == re)
					indices[i1]++;
			}

		}
		System.out.println(arr[n]);

	}

}
