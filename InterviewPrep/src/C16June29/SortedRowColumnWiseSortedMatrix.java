package C15June28;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SortedRowColumnWiseSortedMatrix {

	public static class Pair implements Comparable<Pair>{
		int data;
		int li;
		int di;

		Pair(int data, int li, int di) {
			this.data = data;
			this.li = li;
			this.di = di;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.data-o.data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++)
		{
			Pair x = new Pair(arr[i][0], i, 0);
			pq.add(x);
		}
		
		while(!pq.isEmpty()){
			Pair x = pq.remove();
			System.out.print(x.data+" ");
			if(x.di +1 <arr[0].length){
				int d=x.di;
				x.di=d+1;
				x.data=arr[x.li][x.di];
				pq.add(x);
			}
			
		}
			

	}

}
