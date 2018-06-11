package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HamiltonianCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] arr = new int[x][x];

		for (int i = 0; i < y; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		solve(arr, 0, new ArrayList<Integer>());

	}

	public static void solve(int[][] arr, int node, ArrayList<Integer> path) {
		
		path.add(node);

		if(path.size()==arr.length){
			System.out.println("P:"+path);
			
			int x=path.get(path.size()-1);
			int y=path.get(0);
			if(arr[y][x]!=0){
				System.out.println("C:"+path);
			}
			else{
				System.out.println("C:null");
			}
					
			
		}

		

		for (int i = 0; i < arr[node].length; i++) {

			if (arr[node][i] != 0 && path.contains(i)==false) {

				solve(arr, i, path);

			}

		}
		path.remove(path.size()-1);

	}

}
