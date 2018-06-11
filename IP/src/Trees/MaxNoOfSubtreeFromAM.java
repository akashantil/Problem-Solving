package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MaxNoOfSubtreeFromAM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		System.out.println(solve(arr));
	}

	public static int solve(int[][] arr) {

		HashMap<Integer, ArrayList<Integer>> child = new HashMap<>();
		HashMap<Integer, Integer> ways = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 1) {
					
					count++;
				}

			}
			if(child.containsKey(count)){
				ArrayList<Integer> temp = child.get(count);
				temp.add(i);
				child.put(count, temp);
				
			}
			else{
			ArrayList<Integer> ab = new ArrayList<>();
			ab.add(i);
			child.put(count, ab);
			}
		}
		
		
		HashSet<Integer> avail= new HashSet<>();
		for(int i=1;i<arr.length;i++){
			avail.add(i);
		}
		
		ArrayList<Integer> desen= new ArrayList<Integer>(child.keySet());
		
		for(int i=0;i<desen.size();i++){
			
			int cno=desen.get(i);
			
			{
				ArrayList<Integer> temp = child.get(cno);
				for(int j=0;j<temp.size();j++){
					if(cno==0){
						ways.put(temp.get(j), 1);
					}
					else{
						int count=0;
						int left=0;
						int right=0;
						for(int k=0;k<arr.length;k++){
							if(arr[temp.get(j)][k]==1 && avail.contains(k)==true){
								count++;
								if(left==0)
									left=k;
								else
									right=k;
								
								
							}
							
						}
						int ans=0;
						if(ways.get(left)!=null){
							ans=2*ways.get(left);
						}
						else 
							ans=2*1;
						
						if(ways.get(right)!=null){
							ans*=ways.get(right);
						}
						else 
							ans*=1;
						
						if(left!=0)
							avail.remove(left);
						if(right!=0)
							avail.remove(right);
						
					
						ways.put(temp.get(j), ans);
						
					}
				}
				
				
				
			}
		}
		
		
		return ways.get(0);

	}
}
