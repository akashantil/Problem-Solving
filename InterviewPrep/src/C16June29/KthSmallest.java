package C16June29;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = sc.nextInt();
		int k = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		int noe = k;
		int i = 0;
		int j = 0;
		for (i = 0; i < row  ; i++) {
			for (j = 0; j < col ; j++) {
				
				if(noe>0){
				pq.add(arr[i][j]);
				noe--;
				
			}
				else{
					int ele=arr[i][j];
					if(ele<pq.peek()){
						pq.remove();
						pq.add(ele);
					}
				}
		}
		}
		

		System.out.println(pq.peek());

	}

}
